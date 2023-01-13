package com.example.test.controller;

import com.example.test.entity.User;
import com.example.test.services.userServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class home {

    @Autowired
    private userServiceImplementation userServiceImp;

    @GetMapping("/home")
    public String home(){
        return "this is test";
    }

    @PostMapping("/savingData") // use localhost:2626/savingData to test and pass json data { "fname":"Demo", "lname":"Test"}
    public User saveData(@RequestBody User u){
        userServiceImp.saveUser(u);
        return u;
    }
    @GetMapping("/gettingData") // use localhost:2626/gettingData to get all data from database
    public List<User> getData(){
        return (List<User>)userServiceImp.getUsers();
    }

    @PutMapping("/updatingData") // use localhost:2626/updatingData to update data based on id and pass json data
    public User updateData(@RequestBody User u){
        userServiceImp.saveUser(u);
        return u;
    }

}
