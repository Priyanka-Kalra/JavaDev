package com.demo.moviebooking.Implementations;

import com.demo.moviebooking.Interface.Payment;
import com.demo.moviebooking.Models.Booking;

public class Card implements Payment {
    @Override
    public boolean pay(Booking booking){

        System.out.println("Payment Success via Card for "+booking.toString());
        return true;
    }
}
