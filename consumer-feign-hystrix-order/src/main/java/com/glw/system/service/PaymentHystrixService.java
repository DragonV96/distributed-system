package com.glw.system.service;

import com.glw.system.entity.Payment;
import com.glw.system.entity.vo.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author : glw
 * @date : 2020/6/27
 * @time : 21:10
 * @Description : 支付接口服务层
 */
@Component
@FeignClient(value = "HYSTRIX-PAYMENT-SERVICE", fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {

    @PostMapping("/create")
    ApiResponse create(@RequestBody Payment payment);

    @GetMapping("/payment/get/{id}")
    ApiResponse<Payment> getPaymentById(@PathVariable("id") Long id);

    /**
     * openFeign 模拟服务调用超时接口
     * @return
     */
    @GetMapping("/payment/feign/timeout")
    ApiResponse<String> timeout();

    /**
     * hystrix 模拟服务调用接口
     * @return
     */
    @GetMapping("/payment/hystrix/{id}")
    ApiResponse<String> getPaymentInfo(@PathVariable("id") Integer id);

    /**
     * hystrix 模拟服务调用超时接口
     * @return
     */
    @GetMapping("/payment/hystrix/timeout/{id}")
    ApiResponse<String> getPaymentInfoTimeOut(@PathVariable("id") Integer id);
}
