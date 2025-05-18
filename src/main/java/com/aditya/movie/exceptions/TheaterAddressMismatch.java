package com.aditya.movie.exceptions;

public class TheaterAddressMismatch extends RuntimeException{
    public TheaterAddressMismatch() {
        super("Theater Not Found At The Given Address");
    }
}
