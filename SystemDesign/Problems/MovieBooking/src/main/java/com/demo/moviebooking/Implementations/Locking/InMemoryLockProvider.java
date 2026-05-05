package com.demo.moviebooking.Implementations.Locking;

import com.demo.moviebooking.Interface.Locking.LockProvider;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class InMemoryLockProvider implements LockProvider {

    public static class Expiry{
        private final long deadline;
        private final UUID userId;

        public Expiry(long deadline, UUID userId) {
            this.deadline = deadline;
            this.userId = userId;
        }

        public long getDeadline() {
            return deadline;
        }

        public UUID getUserId() {
            return userId;
        }
    }

    private Map<String,Expiry> expiryMap = new ConcurrentHashMap<>();//key,expiry
    private final ScheduledExecutorService scheduledService = Executors.newScheduledThreadPool(1);

    public InMemoryLockProvider(){
        scheduledService.scheduleAtFixedRate(()->this.sweep(),1,1, TimeUnit.MINUTES);
    }

    private void sweep(){
        Long now=System.currentTimeMillis();
        expiryMap.entrySet().removeIf(entry-> entry.getValue().getDeadline()<=now);
    }
    @Override
    public boolean lock(UUID userId,String key, Long ttlMs){
        Long now=System.currentTimeMillis();

        boolean[] acquired= {false};
        expiryMap.compute(key,(key,existing)->{
            if(existing!=null && existing.getDeadline()>now)return existing;
            else{
                acquired[0]=true;
                return new Expiry(now+ttlMs,userId);
            }
        });

        return acquired[0];
    }
    @Override
    public boolean unlock(String key){
        expiryMap.remove(key);
    }

    @Override
    public boolean isLockExpired(String key){
        Long now=System.currentTimeMillis();
        Expiry oldExpiry=expiryMap.get(key);

        if(oldExpiry!=null && oldExpiry.getDeadline()<=now)return true;
        return false;

    }
    @Override
    public boolean isLockedBy(UUID userId,String key){
        Expiry oldExpiry=expiryMap.get(key);

        return oldExpiry!=null && oldExpiry.getUserId().equals(userId);

    }
}
