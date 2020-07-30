package com.glw.system.controller;

import com.glw.system.entity.Payment;
import com.glw.system.entity.vo.ApiResponse;
import com.glw.system.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author : glw
 * @date : 2020/6/27
 * @time : 21:22
 * @Description : feign订单远程调用控制层
 */
@RestController
@Slf4j
@RequestMapping("/consumer")
@DefaultProperties(defaultFallback = "getPaymentInfoGlobalHandler")
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @PostMapping("/create")
    public ApiResponse create(@RequestBody Payment payment) {
        return paymentHystrixService.create(payment);
    }

    @GetMapping("/payment/get/{id}")
    public ApiResponse<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentHystrixService.getPaymentById(id);
    }

    /**
     * 模拟服务调用超时接口
     * @return
     */
    @GetMapping("/payment/feign/timeout")
    ApiResponse<String> timeout() {
        // openfeign 一般默认等待 1 秒钟
        return paymentHystrixService.timeout();
    }

    /**
     * hystrix 模拟服务调用接口
     * @return
     */
    @GetMapping("/payment/hystrix/{id}")
    public ApiResponse<String> getPaymentInfo(@PathVariable("id") Integer id) {
        return paymentHystrixService.getPaymentInfo(id);
    }

    /**
     * hystrix 模拟服务调用超时接口
     * @return
     */
//    @HystrixCommand(fallbackMethod = "getPaymentInfoTimeOutHandler", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//    })
    @HystrixCommand
    @GetMapping("/payment/hystrix/timeout/{id}")
    public ApiResponse<String> getPaymentInfoTimeOut(@PathVariable("id") Integer id) {
        int age = 10 / 0;
        return paymentHystrixService.getPaymentInfoTimeOut(id);
    }

    public ApiResponse<String> getPaymentInfoTimeOutHandler(@PathVariable("id") Integer id) {
        String result = "消费者 " + id + " 服务降级";
        return ApiResponse.success(result);
    }

    public ApiResponse<String> getPaymentInfoGlobalHandler() {
        String result = "global >>> 消费者 服务降级";
        return ApiResponse.success(result);
    }
}
