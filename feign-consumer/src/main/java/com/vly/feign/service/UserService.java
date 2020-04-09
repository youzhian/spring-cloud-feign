package com.vly.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="feign-provide-server")
public interface UserService {

    @RequestMapping(value="/user/sayHi")
    public String sayHi(@RequestParam("name") String name);
}
