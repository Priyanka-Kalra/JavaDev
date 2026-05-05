package com.demo.moviebooking.Service;

import com.demo.moviebooking.Repository.TheatreRepo;

public class TheatreService {
    private TheatreRepo theatreRepo;
    public TheatreService(TheatreRepo theatreRepo) {
        this.theatreRepo = theatreRepo;
    }
}
