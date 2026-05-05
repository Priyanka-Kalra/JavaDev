package com.demo.moviebooking.Models;

import java.util.UUID;

public class Movie {
    private final UUID id;
    private String title;
    private int duration;

    public Movie(String title, int duration) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.duration = duration;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
