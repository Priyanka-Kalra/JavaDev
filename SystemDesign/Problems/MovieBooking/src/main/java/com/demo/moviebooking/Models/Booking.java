package com.demo.moviebooking.Models;

import com.demo.moviebooking.Enums.BookingStatus;
import com.demo.moviebooking.Interface.Payment;

import java.util.List;
import java.util.UUID;

public class Booking {

    private final UUID id;
    private final UUID userId;
    private final UUID showId;
    private final UUID movieId;
    private final List<Seat> seats;
    private Payment paymentType;
    private Double price;
    private BookingStatus bookingStatus;


    public Booking( UUID userId,UUID showId, UUID movieId, List<Seat> seats, Payment paymentType, Double price) {
        this.id = UUID.randomUUID();
        this.userId = userId;
        this.showId = showId;
        this.movieId = movieId;
        this.seats = seats;
        this.paymentType = paymentType;
        this.price = price;
        this.bookingStatus = BookingStatus.CREATED;
    }

    public UUID getId() {
        return id;
    }

    public UUID getUserId() {
        return userId;
    }

    public UUID getShowId() {
        return showId;
    }

    public UUID getMovieId() {
        return movieId;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public Payment getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Payment paymentType) {
        this.paymentType = paymentType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", userId=" + userId +
                ", showId=" + showId +
                ", movieId=" + movieId +
                ", seats=" + seats +
                ", paymentType=" + paymentType +
                ", price=" + price +
                ", bookingStatus=" + bookingStatus +
                '}';
    }
}
