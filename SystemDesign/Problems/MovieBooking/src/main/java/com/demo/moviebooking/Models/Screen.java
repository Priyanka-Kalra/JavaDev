package com.demo.moviebooking.Models;

import java.util.List;
import java.util.UUID;

public class Screen {

    private final UUID id;
    private List<Seat> seats;

    public Screen(List<Seat> seats) {
        this.id = UUID.randomUUID();
        this.seats = seats;
    }

    public UUID getId() {
        return id;
    }


    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
