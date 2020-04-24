package com.micro.user.controller;

import com.micro.domain.entity.UserInfo;
import com.micro.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RefreshScope
@RequestMapping(value = "/api")
public class UserController {
    @Autowired
    UserService userService;
    @Value(value = "${test.test}")
    String data;

    @GetMapping("/user")
    public List<UserInfo> findUsers() {
        System.out.printf("data数据为:" + data);
        return userService.getUsers();
    }

    @PostMapping("/user")
    public void insertUser(UserInfo user) {
        user.setId(UUID.randomUUID().toString());
        userService.insterUser(user);
    }

    @GetMapping("/test")
    public String getTest() {
        return "hello 2020";
    }
}
