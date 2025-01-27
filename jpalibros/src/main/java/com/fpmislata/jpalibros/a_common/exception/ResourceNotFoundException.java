package com.fpmislata.jpalibros.a_common.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("The resource was not found");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
