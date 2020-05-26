package com.glw.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : glw
 * @date : 2020/5/26
 * @time : 22:29
 * @Description : 启动类
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulPaymentApplication.class, args);
    }
}
