package com.vly.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * gateWay
 * @author youzhian
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayApplication {

    public static void main(String []args){
        SpringApplication.run(GateWayApplication.class,args);
        System.out.println("============gateway启动成功============");
    }

    /**
     * 路由规则
     * @param builder
     * @return
     */
    //@Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("baidu_route",
                        r->r.path("/baidu/**")
                        .filters(f->f.stripPrefix(1))
                        .uri("http://www.baidu.com:80/"))
                .route("consumer_route",r->r.path("consumer")
                        .filters(f->f.stripPrefix(1))
                        .uri("lb://feign-consumer-server"))
                .build();
    }
}
