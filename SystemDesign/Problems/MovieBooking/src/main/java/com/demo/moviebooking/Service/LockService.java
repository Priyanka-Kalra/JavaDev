package com.demo.moviebooking.Service;

import com.demo.moviebooking.Interface.Locking.LockProvider;

import java.util.UUID;

public class LockService {

    private LockProvider lockProvider;
    public LockService(LockProvider lockProvider){
        this.lockProvider = lockProvider;
    }

    public boolean lock(UUID userId, String key, Long ttms) {
        return lockProvider.lock(userId,key,ttms);
    }

    public boolean unlock(String key) {
        lockProvider.unlock(key);
    }

    public boolean isLockedBy(UUID userId, String key) {

        return lockProvider.isLockedBy(userId,key);
    }
}
