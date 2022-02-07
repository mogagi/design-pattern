package com.mblin.oo.di.ex1;

public class FavoriteVideosService {
    private VideoService videoService;
    private FavoritesService favoritesService;

    private FavoriteVideosService(VideoService videoService, FavoritesService favoritesService) {
        this.videoService = videoService;
        this.favoritesService = favoritesService;
    }
}