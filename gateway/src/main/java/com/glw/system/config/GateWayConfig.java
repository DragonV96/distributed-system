package com.glw.system.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : glw
 * @date : 2020/8/1
 * @time : 23:25
 * @Description : 网关配置
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_other",
                r -> r.path("/hystrix/timeout/**").uri("http://127.0.0.1:8001/hystrix/timeout/20")).build();
        return routes.build();
    }

//    public static void main(String[] args) {
//        ZonedDateTime now = ZonedDateTime.now();
//        System.out.println(now);
//    }
}
