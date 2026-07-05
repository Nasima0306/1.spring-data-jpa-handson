package com.example1.Spring_data_jpa_hands_on.exception;

public class CountryNotFoundException extends Exception{
    public CountryNotFoundException(String message) {
        super(message);
    }
}
