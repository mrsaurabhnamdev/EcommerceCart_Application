package com.l3.p4.exception;

public class CartEmptyException extends RuntimeException {

    public CartEmptyException(String message) {
        super(message);
    }
}

