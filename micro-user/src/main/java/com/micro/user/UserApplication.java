package com.micro.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableAutoConfiguration(exclude = JtaAutoConfiguration.class)
@EnableAutoConfiguration
//@NacosConfigurationProperties(dataId = "nacos-spring", autoRefreshed = true)
@EntityScan(value = "com.micro.domain.entity")
@RefreshScope
public class UserApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(UserApplication.class, args);
//        String test = configurableApplicationContext.getEnvironment().getProperty("test.test");
//        System.out.printf("test的数据" + test);

    }


}
