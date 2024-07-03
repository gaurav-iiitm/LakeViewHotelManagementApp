package com.vacation.lakesidehotel.exception;

/**
 * @author Gaurav Yadav
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
