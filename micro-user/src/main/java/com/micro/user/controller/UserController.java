package com.micro.user.controller;

import com.micro.domain.entity.User;
import com.micro.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RefreshScope
public class UserController {
    @Autowired
    UserService userService;
    @Value(value = "${test.test}")
    String data;

    @GetMapping("/users")
    public List<User> findUsers() {
        System.out.printf("data数据为:" + data);

        List<User> users = userService.getUsers();
        return users;
    }

    @PostMapping("/user")
    public void insertUser(User user) {
        user.setId(UUID.randomUUID().toString());
        userService.insterUser(user);
    }

    @GetMapping("/test")
    public String getTest() {
        return "hello 2020";
    }
}
