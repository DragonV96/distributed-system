package com.glw.system;

import com.glw.rule.CustomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author : glw
 * @date : 2020/3/29
 * @time : 13:07
 * @Description : 启动类
 */
@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name = "PAYMENT-SERVICE", configuration = CustomRule.class)
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
