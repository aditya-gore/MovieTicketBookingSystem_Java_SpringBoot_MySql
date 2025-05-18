package com.aditya.movie.exceptions;

public class ShowDoesNotExist extends RuntimeException{
    public ShowDoesNotExist() {
        super("Show Does Not Exist");
    }
}
