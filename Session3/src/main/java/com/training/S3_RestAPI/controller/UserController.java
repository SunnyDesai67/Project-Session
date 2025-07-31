package com.training.S3_RestAPI.controller;

import com.training.S3_RestAPI.entities.User;
import com.training.S3_RestAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable int id){
        return userService.deleteUserById(id);
    }


    @GetMapping("/{character}")
    public List<User> findByAlphabet(@PathVariable Character character){
        return userService.findByAlphabet(character);
    }
}
