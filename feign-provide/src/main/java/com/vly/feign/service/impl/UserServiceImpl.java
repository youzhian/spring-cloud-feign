package com.vly.feign.service.impl;

import com.vly.feign.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

/**
 *用户信息service
 * @author 游志安
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     * 根据用户名称获取用户全名
     *
     * @param name 用户名称
     * @return
     */
    @Override
    public String getUserFullName(String name) {
        if(StringUtils.isNotBlank(name)){
            return "尼古拉斯."+name;
        }
        return null;
    }
}
