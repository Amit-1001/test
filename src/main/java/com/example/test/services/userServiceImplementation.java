package com.example.test.services;

import com.example.test.dao.userRepository;
import com.example.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImplementation implements userService{

    @Autowired
    private userRepository userRepo;

    @Override
    public User saveUser(User user) {
        userRepo.save(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        userRepo.save(user);
        return user;
    }

    @Override
    public List<User> getUsers() {
        return (List<User>) userRepo.findAll();
    }
}
