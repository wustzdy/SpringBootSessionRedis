package com.wustzdy.springboot.session.redis.first.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "session",url = "http://localhost:8090")
public interface ControllerInterface {
    @RequestMapping("/setSession/{key}/{value}")
    public String setSession(@PathVariable("key") String key, @PathVariable("value") String value);
    @RequestMapping("/getSession/{key}")
    public String getSession(@PathVariable(name = "key") String key);
}
