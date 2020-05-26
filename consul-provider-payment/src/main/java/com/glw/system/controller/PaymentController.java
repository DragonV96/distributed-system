package com.glw.system.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : glw
 * @date : 2020/5/26
 * @time : 22:31
 * @Description : 支付控制层
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/consul")
    public String payment() {
        log.info(" >>>>> consul server port = {}", serverPort);
        return "consul";
    }
}
