package com.glw.system.controller;

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

    @Value("${serivce-url.nacos-user-service}")
    private String serverURL;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/payment/nacos/{id}")
    public ApiResponse<String> getPaymentById(@PathVariable("id") Long id) {
        log.info(" >>>>> Request id = {}", id);
        return restTemplate.getForObject(serverURL + "/payment/nacos/" + id, ApiResponse.class);
    }
}
