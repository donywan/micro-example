package com.nacos.classroom.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("service-provider")
public interface UserClient {
    @GetMapping("/users")
    public String getUsers();
    @PostMapping("/user")
    public void instertUser(@RequestBody String user);
    @GetMapping("/test")
    public String getTest();
}
