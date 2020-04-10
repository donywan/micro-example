package com.nacos.user.service.impl;

import com.nacos.domain.entity.User;
import com.nacos.user.mapper.UserMapper;
import com.nacos.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.findUser();
    }

    @Override
    public void insterUser(User user) {
        userMapper.insertUser(user);
    }
}
