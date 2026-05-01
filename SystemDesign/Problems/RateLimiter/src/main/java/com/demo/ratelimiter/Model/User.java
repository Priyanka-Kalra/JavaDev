package com.demo.ratelimiter.Model;

import java.util.UUID;

public class User {

    private UUID userId;
    private TierType tier;

    public enum TierType{ FREE, PREMIUM};

    public User(TierType tier) {
        userId = UUID.randomUUID();
        this.tier = tier;
    }

    public TierType getTier() {
        return tier;
    }

    public void setTier(TierType tier) {
        this.tier = tier;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
}
