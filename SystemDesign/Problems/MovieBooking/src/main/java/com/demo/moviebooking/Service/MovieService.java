package com.demo.moviebooking.Service;

import com.demo.moviebooking.Models.Movie;
import com.demo.moviebooking.Models.Show;
import com.demo.moviebooking.Repository.MovieRepo;
import com.demo.moviebooking.Repository.ShowRepo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class MovieService {

    private MovieRepo movieRepo;
    private ShowService showService;
    public MovieService(MovieRepo movieRepo, ShowService showService) {

        this.movieRepo = movieRepo;
        this.showService = showService;
    }

    public List<Show> findShows(Movie movie) {

        return showService.findShowByMovie(movie);
    }

    public Movie getOrCreateMovie(String title, int duration) {
        Optional<Movie> movie=movieRepo.findMovie(title);
        if(movie.isPresent())return movie.get();

        Movie newMovie= new Movie(title,duration);
        movieRepo.save(newMovie);
        return newMovie;

    }




}
