package com.demo.moviebooking.Repository;

import com.demo.moviebooking.Models.User;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

public class UserRepo {
    private Map<UUID,User> userDb=new ConcurrentMap<>();

    public Optional<User> findUser(UUID userId) {
        return Optional.ofNullable(userDb.get(userId));
    }

    public void save(User newUser) {
        userDb.put(newUser.getId(), newUser);
    }
}
