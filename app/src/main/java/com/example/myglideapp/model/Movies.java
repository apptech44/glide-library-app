package com.example.myglideapp.model;

public class Movies {

    private String movieImages;
    private String movieName;

    public Movies(String movieImages, String movieName) {
        this.movieImages = movieImages;
        this.movieName = movieName;
    }

    public String getMovieImages() {
        return movieImages;
    }

    public void setMovieImages(String movieImages) {
        this.movieImages = movieImages;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

}
