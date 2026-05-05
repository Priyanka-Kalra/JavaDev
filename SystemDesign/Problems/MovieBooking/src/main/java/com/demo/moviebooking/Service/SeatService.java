package com.demo.moviebooking.Service;

import com.demo.moviebooking.Enums.SeatStatus;
import com.demo.moviebooking.Models.Seat;
import com.demo.moviebooking.Repository.SeatRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SeatService {
    private SeatRepo seatRepo;
    private LockService lockService;
    public SeatService(SeatRepo seatRepo, LockService lockService) {

        this.seatRepo = seatRepo;
        this.lockService = lockService;
    }


    public void unlockSeats(UUID showId, List<Seat> seats) {
        for (Seat seat : seats) lockService.unlock(showId.toString() + seat.getId().toString());
    }

    public List<Boolean> lockSeats(UUID userId, UUID showId, Long ttms, List<Seat> seats) {

        List<Boolean> result  = seats.stream().
                map(seat->lockService.lock(userId,showId.toString()+seat.getId().toString(),ttms )).toList();
        return result;

    }

    public List<Boolean> validateLock(UUID userId, UUID showId,List<Seat> seats) {
        List<Boolean> result= seats.stream().
                map(seat-> lockService.isLockedBy(userId,showId.toString() + seat.getId().toString())).
                toList();

        return result;
    }

    public void updateSeats(List<Seat> seats, SeatStatus seatStatus) {
        for (Seat seat : seats) seat.setStatus(seatStatus);
        seatRepo.saveSeat(seats);

    }

    public boolean isAvailable(List<Seat> seats) {

        for(Seat seat : seats)if(!seat.getStatus().equals(SeatStatus.AVAILABLE))return false;
    }
}
