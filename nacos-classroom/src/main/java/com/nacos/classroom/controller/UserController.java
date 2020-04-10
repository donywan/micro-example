package com.nacos.classroom.controller;

import com.nacos.classroom.fegin.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    UserClient userClient;

    @GetMapping("/users")
    public String getUsers() {
        return userClient.getUsers();
    }

    @GetMapping("/test")
    public String getTest() {
        return userClient.getTest();
    }
}
