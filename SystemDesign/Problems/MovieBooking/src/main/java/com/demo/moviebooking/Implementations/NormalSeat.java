package com.demo.moviebooking.Implementations;

import com.demo.moviebooking.Models.Seat;

public class NormalSeat extends Seat {

    public NormalSeat(Double price) {
        super(price);
    }

    @Override
    public String seatType() {
        return "Normal Seat";
    }
}
