package com.vly.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户信息接口
 * @author 游志安
 */
//@FeignClient("userService")
public interface UserService {
    /**
     * 根据用户名称获取用户全名
     * @param name 用户名称
     * @return
     */
    //@RequestMapping(value="/getUserFullName")
    public String getUserFullName(String name);
}
