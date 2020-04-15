package com.micro.user.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.micro.domain.entity.User;
import com.micro.user.mapper.UserMapper;
import com.micro.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    @SentinelResource(value = "findUsers")
    public List<User> getUsers() {
        return userMapper.findUser();
    }

    @Override
    @SentinelResource(value = "insertUser")
    public void insterUser(User user) {
        userMapper.insertUser(user);
    }
}
