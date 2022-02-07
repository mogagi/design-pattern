package com.mblin.oo.di;

public class MovieService {
    private MovieDao movieDao;
    private FavoritesService favoritesService;

    public MovieService(MovieDao movieDao, FavoritesService favoritesService) {
        this.movieDao = movieDao;
        this.favoritesService = favoritesService;
    }
}