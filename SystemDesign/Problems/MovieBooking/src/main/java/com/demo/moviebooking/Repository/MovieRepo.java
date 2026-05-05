package com.demo.moviebooking.Repository;

import com.demo.moviebooking.Models.Movie;
import com.demo.moviebooking.Models.Show;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class MovieRepo {

    private Map<String, Movie> movieDB=new ConcurrentHashMap<>();

    public void save(Movie movie) {
        movieDB.put(movie.getTitle(), movie);
    }

    public Optional<Movie> findMovie(String title) {

        return Optional.ofNullable(movieDB.get(title));
    }
}
