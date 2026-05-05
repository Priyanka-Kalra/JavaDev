package com.demo.moviebooking.Implementations;

import com.demo.moviebooking.Models.Seat;

public class Recliner extends Seat {

    public Recliner(Double price) {
        super(price);
    }
    @Override
    public String seatType() {
        return "Recliner";
    }
}
