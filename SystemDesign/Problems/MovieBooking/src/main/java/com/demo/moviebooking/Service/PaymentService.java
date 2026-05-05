package com.demo.moviebooking.Service;

import com.demo.moviebooking.Enums.BookingStatus;
import com.demo.moviebooking.Enums.SeatStatus;
import com.demo.moviebooking.Interface.Payment;
import com.demo.moviebooking.Models.Booking;
import com.demo.moviebooking.Repository.PaymentRepo;

import java.util.List;

public class PaymentService {
    private PaymentRepo paymentRepo;
    private BookingService bookingService;
    private SeatService seatService;

    public PaymentService(PaymentRepo paymentRepo, BookingService bookingService, SeatService seatService) {

        this.paymentRepo = paymentRepo;
        this.bookingService = bookingService;
        this.seatService = seatService;
    }

    public boolean makePayment(Booking booking) {
        Payment payment= booking.getPaymentType();

        List<Boolean> result=seatService.validateLock(booking.getUserId(),booking.getShowId(),booking.getSeats());

        //validating seat availability
        if(result.contains(false)) {
            booking.setBookingStatus(BookingStatus.FAILED);
            bookingService.save(booking);
            throw new IllegalStateException("Movie booking unsuccessful, please try again");
        }

        boolean status= payment.pay(booking);//with status update
        if(!status){
            booking.setBookingStatus(BookingStatus.FAILED);
            bookingService.save(booking);
            seatService.unlockSeats(booking.getShowId(),booking.getSeats());
            throw new IllegalStateException("Payment Failed, please choose another method");

        }
        booking.setBookingStatus(BookingStatus.CONFIRMED);
        seatService.updateSeats(booking.getSeats(), SeatStatus.BOOKED);
        bookingService.save(booking);
        return true;
    }
}
