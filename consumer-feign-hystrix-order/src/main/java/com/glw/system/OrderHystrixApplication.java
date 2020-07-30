package com.glw.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : glw
 * @date : 2020/7/29
 * @time : 22:21
 * @Description : 启动类
 */
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class OrderHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixApplication.class, args);
    }
}
