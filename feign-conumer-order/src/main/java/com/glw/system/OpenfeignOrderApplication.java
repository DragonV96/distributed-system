package com.glw.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : glw
 * @date : 2020/6/27
 * @time : 21:08
 * @Description : 启动类
 */
@SpringBootApplication
@EnableFeignClients
public class OpenfeignOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OpenfeignOrderApplication.class, args);
    }
}
