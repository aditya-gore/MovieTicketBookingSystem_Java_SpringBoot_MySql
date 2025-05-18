package com.aditya.movie.exceptions;

public class UserDoesNotExist extends RuntimeException{
    public UserDoesNotExist() {
        super("User Does Not Exist");
    }
}
