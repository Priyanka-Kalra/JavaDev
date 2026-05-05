package com.demo.moviebooking.Repository;

import com.demo.moviebooking.Models.Movie;
import com.demo.moviebooking.Models.Show;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ShowRepo {
    private Map<UUID, Show> showDB=new ConcurrentHashMap<>();

    public List<Show> getALL() {
        List<Show> showList=new ArrayList<>();
        showList.addAll(showDB.values());
        return showList;
    }
}
