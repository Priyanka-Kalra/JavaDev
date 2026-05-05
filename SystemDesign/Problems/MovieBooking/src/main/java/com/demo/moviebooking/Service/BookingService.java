package com.demo.moviebooking.Service;

import com.demo.moviebooking.Enums.BookingStatus;
import com.demo.moviebooking.Enums.SeatStatus;
import com.demo.moviebooking.Interface.Payment;
import com.demo.moviebooking.Models.Booking;
import com.demo.moviebooking.Models.Seat;
import com.demo.moviebooking.Repository.BookingRepo;

import java.util.List;
import java.util.UUID;

public class BookingService {
    Long ttms=5000l;//5 sec lock
    private BookingRepo bookingRepo;
    private SeatService seatService;

    public BookingService(BookingRepo bookingRepo, SeatService seatService) {

        this.bookingRepo = bookingRepo;
        this.seatService = seatService;
    }

    public Booking createBooking(UUID userId,UUID showId, UUID movieId, List<Seat> seats, Payment paymentType) throws Exception {

        //compute price
        Double price=seats.stream().mapToDouble(Seat::getPrice).sum();



        List<Boolean> result=seatService.lockSeats(userId,showId,ttms,seats);
        if(result.contains(false)) throw new Exception("Seats locked/not available, select other seats");

        seatService.updateSeats(seats, SeatStatus.LOCKED);
        Booking booking= new Booking(userId,showId,movieId,seats,paymentType,price);
        this.save(booking);
        return booking;

    }

    public void save(Booking booking) {
        bookingRepo.save(booking);
    }
}
