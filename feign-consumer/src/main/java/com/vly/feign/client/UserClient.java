package com.vly.feign.client;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 消费端client
 * @author youzhian
 */
@RefreshScope
@FeignClient(name="feign-provide-server",path = "/provide")
public interface UserClient {
    /**
     * 根据输入名称返回内容
     * @param name 名称
     * @return
     */
    @GetMapping(value="/user/sayHi")
    public String sayHi(@RequestParam("name") String name);
}
