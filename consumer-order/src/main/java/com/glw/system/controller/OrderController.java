package com.glw.system.controller;

import com.glw.system.common.enums.ErrorCode;
import com.glw.system.entity.Payment;
import com.glw.system.entity.vo.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    private static final String PAYMENT_URL = "http://PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/payment/create")
    public ApiResponse<Payment> create(Payment payment) {
        log.info(" >>>>> Request payment = {}", payment);
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, ApiResponse.class);
    }

    @GetMapping("/payment/get/{id}")
    public ApiResponse<Payment> getPaymentById(@PathVariable("id") Long id) {
        log.info(" >>>>> Request id = {}", id);
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, ApiResponse.class);
    }

    @GetMapping("/payment/getForEntity/{id}")
    public ApiResponse<Payment> getPaymentById2(@PathVariable("id") Long id) {
        log.info(" >>>>> Request id = {}", id);
        ResponseEntity<ApiResponse> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, ApiResponse.class);
        if (entity.getStatusCode().is2xxSuccessful()) {
            return entity.getBody();
        } else {
            return ApiResponse.error(ErrorCode.FAILED_OPERATE);
        }
    }
}
