package com.glw.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : glw
 * @date : 2020/3/29
 * @time : 16:14
 * @Description : 启动类
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaSlave1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSlave1Application.class, args);
    }
}
