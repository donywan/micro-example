package com.nacos.user.service;

import com.nacos.domain.entity.User;

import java.util.List;

//@RestController
public interface UserService {
//    @GetMapping("/users")
    public List<User> getUsers();

//    @PostMapping("/user")
    void insterUser(User user);
}
