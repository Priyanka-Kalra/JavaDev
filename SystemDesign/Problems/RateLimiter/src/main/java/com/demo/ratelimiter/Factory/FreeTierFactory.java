//package com.demo.ratelimiter.Factory;
//
//import com.demo.ratelimiter.Interface.RateLimiter;
//import com.demo.ratelimiter.Interface.TierFactory;
//import com.demo.ratelimiter.Model.RateLimit;
//import com.demo.ratelimiter.RateLimiter.SlidingWindowLog;
//import com.demo.ratelimiter.RateLimiter.TokenBucket;
//import com.demo.ratelimiter.Service.RateLimitService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class FreeTierFactory implements TierFactory {
//    @Autowired
//    private RateLimitService rateLimitService;
//    private int timeThreshold=10;
//
//    @Override
//    public RateLimiter generateRateLimiter(RateLimit usage){
//
//        Long time=rateLimitService.computeTime(usage.getCurrentTimestamp());
//        RateLimiter rateLimiter;
//        if(usage.getCount()<5 && time<timeThreshold)rateLimiter=new SlidingWindowLog();
//        else rateLimiter=new TokenBucket();
//        return rateLimiter;
//
//    }
//
//}
