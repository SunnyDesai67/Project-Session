package com.training.S4_SpringSecurity.services;

import com.training.S4_SpringSecurity.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("abc", "abc", "abc@gmail.com"));
        list.add(new User("xyz", "xyz", "xyz@gmail.com"));
        list.add(new User("pqr", "pqr", "pqr@gmail.com"));
    }

    public User addUser(User user){
        this.list.add(user);
        return user;
    }

    public List<User> getAllUsers(){
        return this.list;
    }

    public User getUser(String username){
        return this.getAllUsers().stream().filter(user -> user.getUsername().equals(username)).findAny().orElse(null);
    }

}
