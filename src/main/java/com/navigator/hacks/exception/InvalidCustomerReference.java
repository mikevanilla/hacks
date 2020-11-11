package com.navigator.hacks.exception;

public class InvalidCustomerReference extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidCustomerReference(String errorMessage) {
        super(errorMessage);
    }
}
