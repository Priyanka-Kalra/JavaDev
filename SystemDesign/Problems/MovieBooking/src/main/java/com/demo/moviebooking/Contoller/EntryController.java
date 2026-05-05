package com.demo.moviebooking.Contoller;

import com.demo.moviebooking.Enums.BookingStatus;
import com.demo.moviebooking.Implementations.Card;
import com.demo.moviebooking.Implementations.Locking.InMemoryLockProvider;
import com.demo.moviebooking.Interface.Locking.LockProvider;
import com.demo.moviebooking.Models.Booking;
import com.demo.moviebooking.Models.Movie;
import com.demo.moviebooking.Models.Show;
import com.demo.moviebooking.Models.User;
import com.demo.moviebooking.MovieBookingApplication;
import com.demo.moviebooking.Repository.*;
import com.demo.moviebooking.Service.*;
import org.springframework.boot.SpringApplication;

import java.util.*;

public class EntryController {
    public static void main(String[] args) {

        SpringApplication.run(MovieBookingApplication.class, args);

        //repo creation
        BookingRepo bookingRepo = new BookingRepo();
        UserRepo userRepo = new UserRepo();
        MovieRepo movieRepo = new MovieRepo();
        PaymentRepo paymentRepo = new PaymentRepo();
        SeatRepo seatRepo = new SeatRepo();
        ShowRepo showRepo = new ShowRepo();
        TheatreRepo theatreRepo = new TheatreRepo();

        //service creation
        ShowService showService = new ShowService(showRepo);
        LockProvider lockProvider=new InMemoryLockProvider();
        LockService lockService=new LockService(lockProvider);
        SeatService seatService = new SeatService(seatRepo,lockService);
        BookingService bookingService = new BookingService(bookingRepo,seatService);
        TheatreService theatreService = new TheatreService(theatreRepo);
        UserService userService = new UserService(userRepo);
        PaymentService paymentService=new PaymentService(paymentRepo,bookingService,seatService);
        MovieService movieService=new MovieService(movieRepo,showService);


        //sample user and seat id
        UUID userId =b1ec27a8-fb5d-4488-97ce-c6693bc54204;
        UUID seatId1=9de8b637-e137-4038-a2d1-360a03472c0b;
        UUID seatId2=ae9a855c-8054-40e2-9487-e8e456cf74df;

        //1. get/create User
        User user=userService.getOrCreateUser(userId,"abc@gmail.com","Priyanka");

        //2. Search Movie : return list of show
        Movie movie=movieService.getOrCreateMovie("Conjuring2",90);
        List<Show> showList=movieService.findShows(movie);
        if(showList.isEmpty()) {
            System.out.println("No Shows for the movie");
            return;
        }

        //3. User selects the show and creates a booking,
        Show show=showList.stream().findAny().get();
        Booking booking;
        try{
            booking=bookingService.createBooking(user.getId(),show.getId(),movie.getId(),new ArrayList<>(Arrays.asList(seatId1,seatId2)),new Card());
        }
        catch(Exception e){
            System.out.println(e);
            return;
        }

        //4. Payment is initiated:
        //      Notify if payment Success
        //      release the seats if payment fails

        try{
            boolean paySuccess=paymentService.makePayment(booking);
            System.out.println("Movie booking has been made");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

}
