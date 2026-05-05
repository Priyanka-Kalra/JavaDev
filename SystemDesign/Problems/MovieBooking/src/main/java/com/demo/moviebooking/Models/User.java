package com.demo.moviebooking.Models;

import java.util.UUID;

public class User {

    private final UUID id;
    private String email;
    private String name;

    public User(String email,String name) {
        this.id = UUID.randomUUID();
        this.email = email;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
