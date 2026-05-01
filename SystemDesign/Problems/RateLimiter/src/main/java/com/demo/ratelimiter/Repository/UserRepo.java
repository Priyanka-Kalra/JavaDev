package com.demo.ratelimiter.Repository;

import com.demo.ratelimiter.Model.User;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepo {
    private Map<UUID,User> userList=new ConcurrentHashMap<>();

    public Optional<User> findByID(UUID id) {
        return Optional.ofNullable(userList.get(id));

    }

    public void saveUser(User user) {
        userList.put(user.getUserId(), user);
    }
}
