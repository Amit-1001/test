package com.example.test.services;

import com.example.test.entity.User;

import java.util.List;

public interface userService {

    public User saveUser(User user); // saving data
    public User updateUser(User user); // update user
    public List<User> getUsers(); // get all users


}
