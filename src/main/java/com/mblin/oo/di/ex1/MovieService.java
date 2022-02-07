package com.mblin.oo.di.ex1;

import java.util.List;

public abstract class MovieService {
    private FavoriteVideosService favoriteVideosService;
    private MovieDao movieDao;

    public MovieService(FavoriteVideosService favoriteVideosService, MovieDao movieDao) {
        this.favoriteVideosService = favoriteVideosService;
        this.movieDao = movieDao;
    }

    public abstract List<DecoratedMovie> getFavoritesMovies();

    public abstract Movie getMovie();
}