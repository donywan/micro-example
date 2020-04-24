package com.micro.user;

import com.micro.domain.entity.UserInfo;
import com.micro.user.mapper.UserInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class ProviderApplicationTests {

	@Autowired
	UserInfoMapper userMapper;
	@Test
	void contextLoads() {

		UserInfo user = new UserInfo();
		user.setId(UUID.randomUUID().toString());
		user.setAge(1);
		user.setName("wang");
		Integer integer = userMapper.insertUser(user);
		System.out.println(integer);
	}

}
