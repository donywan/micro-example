package com.nacos.user;

import com.nacos.domain.entity.User;
import com.nacos.user.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class ProviderApplicationTests {

	@Autowired
	UserMapper userMapper;
	@Test
	void contextLoads() {

		User user = new User();
		user.setId(UUID.randomUUID().toString());
		user.setAge(1);
		user.setName("wang");
		Integer integer = userMapper.insertUser(user);
		System.out.println(integer);
	}

}
