package com.demo.moviebooking.Service;

import com.demo.moviebooking.Models.Movie;
import com.demo.moviebooking.Models.Show;
import com.demo.moviebooking.Repository.ShowRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShowService {
    private ShowRepo showRepo;
    public ShowService(ShowRepo showRepo) {
        this.showRepo = showRepo;
    }

    public List<Show> findShowByMovie(Movie movie) {

        List<Show> allShows=showRepo.getALL();

        List<Show> showList=new ArrayList<>();
        for(Show show:allShows){
            if(show.getMovie().equals(movie))showList.add(show);
        }
        return showList;
    }
}
