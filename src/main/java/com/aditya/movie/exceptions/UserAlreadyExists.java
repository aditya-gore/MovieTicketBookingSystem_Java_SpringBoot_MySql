package com.aditya.movie.exceptions;

public class UserAlreadyExists extends RuntimeException{
    public UserAlreadyExists() {
        super("User Already Exists With This EmailId");
    }
}
