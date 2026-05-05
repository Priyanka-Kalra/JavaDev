package com.demo.moviebooking.Repository;

import com.demo.moviebooking.Models.Seat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class SeatRepo {

    private Map<UUID, Seat> seatDB = new ConcurrentHashMap<>();

    public void saveSeat(List<Seat> seats) {
        seats.stream().forEach(seat->seatDB.put(seat.getId(),seat));
    }

}
