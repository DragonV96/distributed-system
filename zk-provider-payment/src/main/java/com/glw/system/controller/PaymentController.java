package com.glw.system.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author : glw
 * @date : 2020/3/28
 * @time : 0:27
 * @Description : 支付控制层
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/zk")
    public String payment() {
        log.info(" >>>>> zookeeper server port = {}", serverPort);
        return "zookeeper";
    }
}
