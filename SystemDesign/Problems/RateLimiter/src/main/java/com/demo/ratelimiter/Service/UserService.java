package com.demo.ratelimiter.Service;

import com.demo.ratelimiter.Model.RateLimit;
import com.demo.ratelimiter.Model.User;
import com.demo.ratelimiter.Repository.RateLimiterRepo;
import com.demo.ratelimiter.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    private RateLimiterRepo rateLimiterRepo;

    public Optional<User> findUser(UUID id) {
        Optional<User> user=userRepo.findByID(id);
        return user;
    }

    public Optional<User> createUser() {

        //create new user
        User user=new User(User.TierType.FREE);//default
        userRepo.saveUser(user);

        //set tier for user
        RateLimit usage=new RateLimit(user.getUserId(),0);
        rateLimiterRepo.saveUsage(user.getUserId(),usage);
        return Optional.of(user);

    }

    public User getOrCreateUser(UUID id) {

        Optional<User> user=this.findUser(id);
        if(user.isEmpty())user=this.createUser();
        return user.get();
    }
}
