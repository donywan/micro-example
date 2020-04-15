package com.micro.classroom.fegin.fallback;

import com.micro.classroom.fegin.UserService;

public class UserServiceFallback implements UserService {
    @Override
    public String getUsers() {
        return null;
    }

    @Override
    public void instertUser(String user) {

    }

    @Override
    public String getTest() {
        return null;
    }
}
