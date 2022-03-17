package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userRepository.getById(id);
    }
}
