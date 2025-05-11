package com.femtech.SpeedBill.service;
import com.femtech.SpeedBill.model.User;
import com.femtech.SpeedBill.repository.UserRepository;
import com.femtech.SpeedBill.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserServiceImpl {
    @Autowired
    public UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        return null;
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return Optional.empty();
    }


//    public User registerUser(User user) {
//        // Add logic for password encryption and validation
//        return userRepository.save(user);
//    }
//
//    public Optional<User> getUserByEmail(String email) {
//        return userRepository.findByEmail(email);
//    }
}

