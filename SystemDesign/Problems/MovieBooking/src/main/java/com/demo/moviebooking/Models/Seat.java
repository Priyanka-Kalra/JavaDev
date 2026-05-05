package com.demo.moviebooking.Models;

import com.demo.moviebooking.Enums.SeatStatus;

import java.util.UUID;

public abstract class Seat {

    private final UUID id;
    private Double price;
    private SeatStatus status;


    public Seat(Double price) {
        this.id = UUID.randomUUID();
        this.price = price;
        this.status = SeatStatus.AVAILABLE;
    }

    public UUID getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public SeatStatus getStatus() {
        return status;
    }

    public void setStatus(SeatStatus status) {
        this.status = status;
    }

    public abstract String seatType();
}
