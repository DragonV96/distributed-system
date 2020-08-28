package com.glw.system.controller;

import com.glw.system.entity.vo.ApiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : glw
 * @date : 2020/8/26
 * @time : 14:59
 * @Description : 支付控制层
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public ApiResponse<String> getPayment(@PathVariable("id") Integer id){
        return ApiResponse.success(serverPort);
    }
}
