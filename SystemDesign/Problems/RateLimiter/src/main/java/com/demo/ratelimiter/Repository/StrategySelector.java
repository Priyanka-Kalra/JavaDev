package com.demo.ratelimiter.Repository;

import com.demo.ratelimiter.Interface.RateLimiter;
import com.demo.ratelimiter.Model.RateLimit;
import com.demo.ratelimiter.Model.User;
import com.demo.ratelimiter.RateLimiter.FixedWindow;
import com.demo.ratelimiter.RateLimiter.SlidingWindowCounter;
import com.demo.ratelimiter.RateLimiter.SlidingWindowLog;
import com.demo.ratelimiter.RateLimiter.TokenBucket;
import com.demo.ratelimiter.Service.RateLimitService;
import com.demo.ratelimiter.Utility.ComputeTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class StrategySelector {
    @Autowired
    private ComputeTime computeTime;
    private final int timeThreshold=10;
    private Map<User.TierType, List<RateLimiter>> strategyMap=new ConcurrentHashMap<>();

    public StrategySelector(){
        strategyMap.put(User.TierType.FREE, List.of(new SlidingWindowLog(),new TokenBucket()));
        strategyMap.put(User.TierType.PREMIUM, List.of(new FixedWindow(),new SlidingWindowCounter()));
    }

    public List<RateLimiter> getRateLimiters(User.TierType tier){
        return strategyMap.get(tier);
    }

    public RateLimiter selectStrategy(User.TierType tier, RateLimit usage) {
        List<RateLimiter> rateLimiterList = this.getRateLimiters(tier);
        RateLimiter rateLimiter = null;
        Long time=computeTime.computeTime(usage.getCurrentTimestamp());
        if(usage.getCount()<5 && time<timeThreshold)rateLimiter=rateLimiterList.get(0);
        else rateLimiter=rateLimiterList .get(1);

        return rateLimiter;
    }

}
