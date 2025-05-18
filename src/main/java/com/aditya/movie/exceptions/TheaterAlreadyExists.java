package com.aditya.movie.exceptions;

public class TheaterAlreadyExists extends RuntimeException{
    public TheaterAlreadyExists() {
        super("Theater Already Exists On This Address");
    }
}
