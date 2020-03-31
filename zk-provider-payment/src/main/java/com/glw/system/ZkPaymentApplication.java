package com.glw.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : glw
 * @date : 2020/3/27
 * @time : 23:24
 * @Description : 启动类
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ZkPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkPaymentApplication.class, args);
    }
}
