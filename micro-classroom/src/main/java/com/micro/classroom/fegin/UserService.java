package com.micro.classroom.fegin;

import com.micro.classroom.fegin.fallback.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "service-provider",fallback = UserServiceFallback.class)
public interface UserService {
    @GetMapping("/api/user")
    String getUsers();
    @PostMapping("/api/user")
    void instertUser(@RequestBody String user);
    @GetMapping("/api/test")
    String getTest();
}
