package com.demo.ratelimiter.Interface;

import com.demo.ratelimiter.Model.RateLimit;

public interface RateLimiter {
    public boolean isAllowed(RateLimit usage);
}
