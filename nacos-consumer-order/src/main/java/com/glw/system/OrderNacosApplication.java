package com.glw.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : glw
 * @date : 2020/8/26
 * @time : 14:57
 * @Description : 启动类
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderNacosApplication.class, args);
    }
}
