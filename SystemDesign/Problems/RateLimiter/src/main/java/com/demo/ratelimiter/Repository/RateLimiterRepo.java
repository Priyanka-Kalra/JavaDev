package com.demo.ratelimiter.Repository;

import com.demo.ratelimiter.Interface.RateLimiter;
import com.demo.ratelimiter.Model.RateLimit;
import com.demo.ratelimiter.Model.User;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class RateLimiterRepo {

    private Map<UUID, RateLimit> rateLimiterMap=new ConcurrentHashMap<>();

    public RateLimit findUsage(UUID userId) {

        return rateLimiterMap.get(userId);
    }

    public void saveUsage(UUID userId, RateLimit usage) {
        rateLimiterMap.put(userId,usage);
    }

    public void updateUsage(RateLimit usage) {

        usage.setCount(usage.getCount()+1);
        //update time
        usage.setCurrentTimestamp(System.currentTimeMillis());
    }
}
