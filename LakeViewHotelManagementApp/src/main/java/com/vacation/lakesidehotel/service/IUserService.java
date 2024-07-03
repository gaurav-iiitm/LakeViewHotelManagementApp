package com.vacation.lakesidehotel.service;

import com.vacation.lakesidehotel.model.User;

import java.util.List;

/**
 * @author Gaurav Yadav
 */

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
