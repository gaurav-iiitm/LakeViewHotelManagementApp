package com.vacation.lakesidehotel.exception;

/**
 * @author Gaurav Yadav
 */

public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}
