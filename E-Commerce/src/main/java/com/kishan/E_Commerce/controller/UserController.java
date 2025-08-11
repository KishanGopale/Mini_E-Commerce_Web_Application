package com.kishan.E_Commerce.controller;


import com.kishan.E_Commerce.model.User;
import com.kishan.E_Commerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("*") // to allow cross-origin requests 2 diff domain ke bich me
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public User loginUser(@RequestBody User user) {
        return userService.loginUser(user.getEmail(), user.getPassword());
    }

    @GetMapping
    private List<User> getAllUsers() {
        return userService.getAllUsers(); // <--- change this
    }

}
