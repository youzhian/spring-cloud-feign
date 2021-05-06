package com.vly.feign.controller;

import com.vly.feign.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author youzhian
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("sayHi")
    public String sayHi(String name){
        String fullName = userService.getUserFullName(name);
        System.out.println("==========我被请求了==========");
        return "你好！" + fullName;
    }
}
