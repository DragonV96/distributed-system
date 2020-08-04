package com.glw.system.controller;

import com.glw.system.common.enums.ErrorCode;
import com.glw.system.entity.Payment;
import com.glw.system.entity.vo.ApiResponse;
import com.glw.system.service.PaymentService;
import com.netflix.discovery.DiscoveryClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

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

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public ApiResponse create(@RequestBody Payment payment) {
        int id = paymentService.create(payment);
        if (id > 0) {
            log.info(" >>>>> Insert payment successfully, payment id = {}", id);
            return ApiResponse.success(id);
        }
        log.error(" >>>>> Failed to insert payment!");
        return ApiResponse.error(ErrorCode.INSERT_ERROR);
    }

    @GetMapping("/get/{id}")
    public ApiResponse<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            log.info(" >>>>> Query payment successfully, payment = {}", payment);
            return ApiResponse.success(payment);
        }
        log.error(" >>>>> There is no record about this payment! Payment id = {}", id);
        return ApiResponse.error(ErrorCode.QUERY_NO_RECORD);
    }

    @GetMapping("/get/loadbalancer")
    public ApiResponse<String> getPaymentLoadBalancer() {
        return ApiResponse.success(serverPort);
    }

    /**
     * 模拟服务调用超时接口
     * @return
     */
    @GetMapping("/feign/timeout")
    public ApiResponse<String> timeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ApiResponse.success(serverPort);
    }

    @GetMapping("/zipkin")
    public ApiResponse<String> zipkin() {
        return ApiResponse.success("payment zipkin, server port = " + serverPort);
    }
}
