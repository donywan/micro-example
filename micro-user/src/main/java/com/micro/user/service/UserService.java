package com.micro.user.service;

import com.micro.domain.entity.User;

import java.util.List;

//@RestController
public interface UserService {
//    @GetMapping("/users")
    public List<User> getUsers();

//    @PostMapping("/user")
    void insterUser(User user);
}
