package com.demo.moviebooking.Implementations;

import com.demo.moviebooking.Interface.Payment;
import com.demo.moviebooking.Models.Booking;

public class UPI implements Payment {

    @Override
    public boolean pay(Booking booking){

        System.out.println("Payment Success via UPI for "+booking.toString());
        return true;
    }
}
