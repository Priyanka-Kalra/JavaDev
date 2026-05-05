package com.demo.moviebooking.Implementations.Locking;

import com.demo.moviebooking.Interface.Locking.LockProvider;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RedisLockProvider implements LockProvider {

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

    private Map<String, InMemoryLockProvider.Expiry> expiryMap = new ConcurrentHashMap<>();//key,expiry
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
        InMemoryLockProvider.Expiry expiry=new InMemoryLockProvider.Expiry(now+ttlMs,userId);


        InMemoryLockProvider.Expiry oldExpiry=expiryMap.get(key);
        if(oldExpiry!=null && oldExpiry.getDeadline()>=now)return false;

        //either expired or not there
        expiryMap.put(key,expiry);
        return true;
    }
    @Override
    public boolean unlock(String key){
        expiryMap.remove(key);
    }

    @Override
    public boolean isLockExpired(String key){
        Long now=System.currentTimeMillis();
        InMemoryLockProvider.Expiry oldExpiry=expiryMap.get(key);

        if(oldExpiry!=null && oldExpiry.getDeadline()<=now)return true;
        return false;

    }
    @Override
    public boolean isLockedBy(UUID userId,String key){
        InMemoryLockProvider.Expiry oldExpiry=expiryMap.get(key);

        return oldExpiry!=null && oldExpiry.getUserId().equals(userId);

    }
}
