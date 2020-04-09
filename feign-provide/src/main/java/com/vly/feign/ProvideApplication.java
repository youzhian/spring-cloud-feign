package com.vly.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务提供者的启动入口
 * @author 游志安
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ProvideApplication {
    /**
     * 程序入口
     * @param args
     */
    public static void main(String [] args){
        SpringApplication.run(ProvideApplication.class,args);
        System.out.println("==============provide启动成功==============");
    }
}
