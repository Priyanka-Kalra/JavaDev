package com.demo.ratelimiter.RateLimiter;

import com.demo.ratelimiter.Interface.RateLimiter;
import com.demo.ratelimiter.Model.RateLimit;

public class SlidingWindowCounter implements RateLimiter {

    @Override
    public boolean isAllowed(RateLimit usage) {
        //logic

        return true;
    }
}
