package com.vly.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 * @author 游志安
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    public static void main( String[] args ){
        SpringApplication.run(EurekaApplication.class, args);
        System.out.println("============eureka启动成功===========");
    }
}
