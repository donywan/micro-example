package com.micro.user.service;

import com.micro.domain.entity.UserInfo;

import java.util.List;

//@RestController
public interface UserService {
//    @GetMapping("/users")
    public List<UserInfo> getUsers();

//    @PostMapping("/user")
    void insterUser(UserInfo user);
}
