package com.glw.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : glw
 * @date : 2020/3/29
 * @time : 13:07
 * @Description : 启动类
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ZkOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkOrderApplication.class, args);
    }
}
