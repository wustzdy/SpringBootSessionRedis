package com.wustzdy.springboot.ression.redis.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;


@SpringBootApplication
//@EnableRedisHttpSession//增加redissession缓存支持
public class ServiceSecondApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceSecondApplication.class,args);
    }
}
