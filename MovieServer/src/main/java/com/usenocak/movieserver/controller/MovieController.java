package com.usenocak.movieserver.controller;

import com.usenocak.movieserver.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {

    @GetMapping("/list")
    public List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Kelebek Etkisi", "2004", "7,7"));
        movies.add(new Movie("Zamanın Ötesinde", "2014", "7,5"));
        return movies;
    }
}
