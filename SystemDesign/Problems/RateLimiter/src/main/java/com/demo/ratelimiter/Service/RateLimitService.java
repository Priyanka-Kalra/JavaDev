package com.demo.ratelimiter.Service;

//import com.demo.ratelimiter.Factory.RateLimitFactory;
import com.demo.ratelimiter.Interface.RateLimiter;
import com.demo.ratelimiter.Model.RateLimit;
import com.demo.ratelimiter.Model.User;
import com.demo.ratelimiter.Repository.RateLimiterRepo;
import com.demo.ratelimiter.Repository.StrategySelector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class RateLimitService {

//    @Autowired
//    private RateLimitFactory rateLimitFactory;

    @Autowired
    private RateLimiterRepo rateLimiterRepo;
    @Autowired
    private StrategySelector strategySelector;


    public boolean isAllowed(User user) {

        User.TierType tier=user.getTier();
        RateLimit usage=rateLimiterRepo.findUsage(user.getUserId());

//        RateLimiter rateLimiter=rateLimitFactory.generateRateLimiter(tier,usage);
        RateLimiter rateLimiter=strategySelector.selectStrategy(tier,usage);
        synchronized (usage) {
            boolean allowed = rateLimiter.isAllowed(usage);
            if (allowed) {
                rateLimiterRepo.updateUsage(usage);
                rateLimiterRepo.saveUsage(user.getUserId(), usage);
            }
            return allowed;

        }
    }
}
