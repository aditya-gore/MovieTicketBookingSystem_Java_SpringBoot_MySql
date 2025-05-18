package com.aditya.movie.exceptions;

public class MovieAlreadyExists extends RuntimeException {
    public MovieAlreadyExists() {
        super("A Movie already exists with same name and language");
    }
}
