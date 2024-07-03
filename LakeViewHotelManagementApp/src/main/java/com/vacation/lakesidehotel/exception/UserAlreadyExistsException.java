package com.vacation.lakesidehotel.exception;

/**
 * @author Gaurav Yadav
 */

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
