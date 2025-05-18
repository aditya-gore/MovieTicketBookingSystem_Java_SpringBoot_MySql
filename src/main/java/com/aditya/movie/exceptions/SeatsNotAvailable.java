package com.aditya.movie.exceptions;

public class SeatsNotAvailable extends RuntimeException{
    public SeatsNotAvailable() {
        super("Requested Seats Are Not Available");
    }
}
