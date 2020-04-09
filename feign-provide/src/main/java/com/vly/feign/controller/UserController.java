package com.vly.feign.controller;

import com.vly.feign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("sayHi")
    public String sayHi(String name){
        String fullName = userService.getUserFullName(name);
        return "你好！" + fullName;
    }
}
