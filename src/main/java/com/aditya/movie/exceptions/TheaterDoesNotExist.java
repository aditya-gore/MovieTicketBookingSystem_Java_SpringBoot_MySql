package com.aditya.movie.exceptions;

public class TheaterDoesNotExist extends RuntimeException{
    public TheaterDoesNotExist() {
        super("Theater Does Not Exist");
    }
}
