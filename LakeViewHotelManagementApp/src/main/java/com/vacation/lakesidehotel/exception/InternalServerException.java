package com.vacation.lakesidehotel.exception;

/**
 * @author Gaurav Yadav
 */

public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}
