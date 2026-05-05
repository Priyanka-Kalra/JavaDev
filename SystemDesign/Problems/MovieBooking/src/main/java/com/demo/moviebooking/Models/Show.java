package com.demo.moviebooking.Models;

import java.time.LocalDateTime;
import java.util.UUID;


public class Show {

    private final UUID id;
    private Movie movie;
    private Theatre theatre;
    private Screen screen;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Show(Movie movie, Theatre theatre, Screen screen, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = UUID.randomUUID();
        this.movie = movie;
        this.theatre = theatre;
        this.screen = screen;
        this.startTime = startTime;
        this.endTime = startTime.plusMinutes(movie.getDuration());
    }

    public UUID getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
