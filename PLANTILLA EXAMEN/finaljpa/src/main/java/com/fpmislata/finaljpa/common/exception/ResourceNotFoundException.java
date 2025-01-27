package com.fpmislata.finaljpa.common.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("The resource was not found");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
