package com.vacation.lakesidehotel.exception;

/**
 * @author Gaurav Yadav
 */

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
