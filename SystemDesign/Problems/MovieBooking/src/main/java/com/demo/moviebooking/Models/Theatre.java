package com.demo.moviebooking.Models;

import java.util.List;
import java.util.UUID;

public class Theatre {

    private final UUID id;
    private final String name;
    private List<Screen> screens;

    public Theatre(List<Screen> screens,String name) {
        this.id = UUID.randomUUID();
        this.screens = screens;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public String getName() {
        return name;
    }

}

