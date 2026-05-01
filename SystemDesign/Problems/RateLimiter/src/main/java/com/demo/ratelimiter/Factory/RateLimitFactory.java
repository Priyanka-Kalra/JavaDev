//package com.demo.ratelimiter.Factory;
//
//import com.demo.ratelimiter.Interface.RateLimiter;
//import com.demo.ratelimiter.Model.RateLimit;
//import com.demo.ratelimiter.Model.User;
//import com.demo.ratelimiter.Service.RateLimitService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class RateLimitFactory {
//
//    @Autowired
//    private RateLimitService rateLimitService;
//
//    public RateLimiter generateRateLimiter(User.TierType tier, RateLimit usage){
//
//        TierFactory tierFactory;
//        switch (tier){
//
//            case PREMIUM:
//                tierFactory=new PremiumTierFactory();
//                break;
//            default:
//                tierFactory=new FreeTierFactory();
//                break;
//        }
//        return tierFactory.generateRateLimiter(usage);
//
//
//    }
//}
