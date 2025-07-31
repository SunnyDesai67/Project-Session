package com.training.S3_RestAPI.service;

import com.training.S3_RestAPI.entities.User;

import java.util.List;

public interface UserService {

    User addUser(User user);

    List<User> getAllUsers();

    User deleteUserById(int id);

    User findByEmail(String email);

    List<User> findByAlphabet(Character character);

}
