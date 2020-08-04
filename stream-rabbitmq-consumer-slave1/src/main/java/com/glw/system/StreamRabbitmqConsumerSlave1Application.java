package com.glw.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author : glw
 * @date : 2020/8/4
 * @time : 12:00
 * @Description : 启动类
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamRabbitmqConsumerSlave1Application {

    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitmqConsumerSlave1Application.class, args);
    }
}
