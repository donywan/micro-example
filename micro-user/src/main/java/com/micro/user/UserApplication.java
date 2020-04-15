package com.micro.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration(exclude = JtaAutoConfiguration.class)
//@NacosConfigurationProperties(dataId = "nacos-spring", autoRefreshed = true)
public class UserApplication {


    public static void main(String[] args) throws SQLException {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(UserApplication.class, args);
//        String test = configurableApplicationContext.getEnvironment().getProperty("test.test");
//        System.out.printf("test的数据" + test);

    }


}
