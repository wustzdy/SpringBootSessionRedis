package com.wustzdy.springboot.ression.redis.second.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
public class TestController{
    /**
     * session设置
     * @param key
     * @param value
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/setSession/{key}/{value}")
    public String setSession(@PathVariable String key , @PathVariable String value,
                             HttpServletRequest request){
        request.getSession().setAttribute(key,value);
        return request.getSession().getId();
    }

    /**
     * 读取session
     * @param key
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/getSession/{key}")
    public String getSession(@PathVariable String key ,HttpServletRequest request){
        return request.getSession().getAttribute(key) + "---- sessionId:" + request.getSession().getId() ;
    }
}
