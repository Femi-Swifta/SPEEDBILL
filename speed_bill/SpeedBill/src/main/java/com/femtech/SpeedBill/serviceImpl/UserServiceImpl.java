package com.femtech.SpeedBill.serviceImpl;

import com.femtech.SpeedBill.model.User;

import java.util.Optional;

public interface UserServiceImpl {
    User registerUser(User user);
    Optional<User> getUserByEmail(String email);
}
