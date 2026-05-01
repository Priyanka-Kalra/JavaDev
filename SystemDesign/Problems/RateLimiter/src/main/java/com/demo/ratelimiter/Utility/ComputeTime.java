package com.demo.ratelimiter.Utility;

import org.springframework.stereotype.Component;

@Component
public class ComputeTime {
    public Long computeTime(Long localTime) {
        return  System.currentTimeMillis() - localTime;
    }
}
