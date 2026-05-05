package com.demo.moviebooking.Interface.Locking;

import java.util.UUID;

public interface LockProvider {

    //key: showid+seatid

    public boolean lock(UUID userId,String key, Long ttlMs);
    public boolean unlock(String key);
    public boolean isLockExpired(String key);
    public boolean isLockedBy(UUID userId,String key);
}
