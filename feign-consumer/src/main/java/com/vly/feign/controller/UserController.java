package com.vly.feign.controller;

import com.vly.feign.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserClient userService;

    @GetMapping("sayHi")
    public String sayHi(String name){
        String result = userService.sayHi(name);
        return result;
    }
}
