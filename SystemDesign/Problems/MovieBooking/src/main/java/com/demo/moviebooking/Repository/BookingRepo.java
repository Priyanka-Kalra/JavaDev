package com.demo.moviebooking.Repository;

import com.demo.moviebooking.Implementations.Card;
import com.demo.moviebooking.Interface.Payment;
import com.demo.moviebooking.Models.Booking;
import com.demo.moviebooking.Models.Seat;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class BookingRepo {
    private Map<UUID,Booking> bookingDB=new ConcurrentHashMap<>();
    public void save(Booking booking) {
        bookingDB.put(booking.getId(),booking);
    }
}
