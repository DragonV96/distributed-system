package com.glw.system.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : glw
 * @date : 2020/5/26
 * @time : 22:31
 * @Description : 支付控制层
 */
@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {

    @Value("${server.port}")
    private String serverPort;

    private static final String PAYMENT_URL = "http://consul-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/payment/consul")
    public String payment() {
        log.info(" >>>>> zookeeper server port = {}", serverPort);
        return restTemplate.getForObject(PAYMENT_URL + "/payment/consul", String.class);
    }
}
