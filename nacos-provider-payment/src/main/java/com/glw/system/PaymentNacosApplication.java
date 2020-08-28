package com.glw.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : glw
 * @date : 2020/8/4
 * @time : 22:15
 * @Description : 启动类
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentNacosApplication.class, args);
    }
}
