package com.glw.system.controller;

import com.glw.system.common.enums.ErrorCode;
import com.glw.system.entity.Payment;
import com.glw.system.entity.vo.ApiResponse;
import com.glw.system.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    public ApiResponse create(Payment payment) {
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
        return ApiResponse.error(ErrorCode.INSERT_ERROR);
    }
}
