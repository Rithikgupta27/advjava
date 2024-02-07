package com.app.exceptions;




public class EmailAlreadyExistsException extends RuntimeException {

    public EmailAlreadyExistsException(String message) {
        super(message);
    }
}


// For validation errors, resource not found, etc. (customize as needed)
