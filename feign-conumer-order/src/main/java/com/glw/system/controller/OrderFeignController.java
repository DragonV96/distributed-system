package com.glw.system.controller;

import com.glw.system.entity.Payment;
import com.glw.system.entity.vo.ApiResponse;
import com.glw.system.service.PaymentFeignService;
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
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @PostMapping("/create")
    public ApiResponse create(@RequestBody Payment payment) {
        return paymentFeignService.create(payment);
    }

    @GetMapping("/payment/get/{id}")
    public ApiResponse<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }
}
