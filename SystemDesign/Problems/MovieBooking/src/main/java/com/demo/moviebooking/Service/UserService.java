package com.demo.moviebooking.Service;

import com.demo.moviebooking.Models.User;
import com.demo.moviebooking.Repository.UserRepo;

import java.util.Optional;
import java.util.UUID;

public class UserService {
    private UserRepo userRepo;
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User getOrCreateUser(UUID userId,String email,String username) {

        Optional<User> user = userRepo.findUser(userId);

        if (user.isPresent()) return user.get();

        User newUser = new User(email, username);
        userRepo.save(newUser);
        return newUser;

    }


    }
}
