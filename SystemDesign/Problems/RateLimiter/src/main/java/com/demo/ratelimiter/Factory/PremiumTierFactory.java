//package com.demo.ratelimiter.Factory;
//
//import com.demo.ratelimiter.Interface.RateLimiter;
//import com.demo.ratelimiter.Interface.TierFactory;
//import com.demo.ratelimiter.Model.RateLimit;
//import com.demo.ratelimiter.Model.User;
//import com.demo.ratelimiter.RateLimiter.FixedWindow;
//import com.demo.ratelimiter.RateLimiter.SlidingWindowCounter;
//import com.demo.ratelimiter.Service.RateLimitService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class PremiumTierFactory  implements TierFactory {
//    @Autowired
//    private RateLimitService rateLimitService;
//    private int timeThreshold=10;
//
//    @Override
//    public RateLimiter generateRateLimiter(RateLimit usage){
//
//        RateLimiter rateLimiter;
//
//        Long time=rateLimitService.computeTime(usage.getCurrentTimestamp());
//        if(usage.getCount()<5 && time<timeThreshold)rateLimiter=new FixedWindow();
//        else rateLimiter=new SlidingWindowCounter();
//        return rateLimiter;
//
//    }
//}
