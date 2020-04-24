package com.micro.user.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.micro.domain.entity.UserInfo;
import com.micro.user.mapper.UserInfoMapper;
import com.micro.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userMapper;

    @Override
    @SentinelResource(value = "findUsers")
    public List<UserInfo> getUsers() {
        return userMapper.findUser();
    }

    @Override
    @SentinelResource(value = "insertUser")
    public void insterUser(UserInfo user) {
        userMapper.insertUser(user);
    }
}
