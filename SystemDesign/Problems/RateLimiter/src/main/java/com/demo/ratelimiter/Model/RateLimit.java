package com.demo.ratelimiter.Model;
import java.util.UUID;


public class RateLimit {

    private UUID userId;
    private int count;
    private Long currentTimestamp;

    public RateLimit(UUID userId, int count) {
        this.userId = userId;
        this.count = count;
        currentTimestamp = System.currentTimeMillis();

    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }



    public Long getCurrentTimestamp() {
        return currentTimestamp;
    }

    public void setCurrentTimestamp(Long currentTimestamp) {
        this.currentTimestamp = currentTimestamp;
    }
}
