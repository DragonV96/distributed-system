package com.glw.system.controller;

import com.glw.system.entity.Payment;
import com.glw.system.entity.vo.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author : glw
 * @date : 2020/3/29
 * @time : 13:13
 * @Description : 订单控制层
 */
@Slf4j
@RestController
@RequestMapping("/consumer")
public class OrderController {

    @Value("${server.port}")
    private String serverPort;

    private static final String PAYMENT_URL = "http://zk-payment-service";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/payment/zk")
    public String payment() {
        log.info(" >>>>> zookeeper server port = {}", serverPort);
        return restTemplate.getForObject(PAYMENT_URL + "/payment/zk", String.class);
    }
}
