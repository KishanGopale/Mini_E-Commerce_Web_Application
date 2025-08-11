package com.kishan.E_Commerce.service;

import com.kishan.E_Commerce.model.User;
import com.kishan.E_Commerce.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        try{

            User newuser = userRepository.save(user);
            System.out.println("user added to database");
            return newuser;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public User loginUser(String email, String password) {
        //check if user exists
        User user = userRepository.findByEmail(email);
        if(user!=null && user.getPassword().equals(password)){
            return user;
        }
        return null;//invalid
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
