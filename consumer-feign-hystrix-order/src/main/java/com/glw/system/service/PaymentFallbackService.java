package com.glw.system.service;

import com.glw.system.common.enums.ErrorCode;
import com.glw.system.entity.Payment;
import com.glw.system.entity.vo.ApiResponse;
import org.springframework.stereotype.Component;

/**
 * @author : glw
 * @date : 2020/7/30
 * @time : 23:27
 * @Description : 统一服务降级处理业务层
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public ApiResponse create(Payment payment) {
        return ApiResponse.error(ErrorCode.SERVICE_FALLBACK);
    }

    @Override
    public ApiResponse<Payment> getPaymentById(Long id) {
        return ApiResponse.error(ErrorCode.SERVICE_FALLBACK);
    }

    @Override
    public ApiResponse<String> timeout() {
        return ApiResponse.error(ErrorCode.SERVICE_FALLBACK);
    }

    @Override
    public ApiResponse<String> getPaymentInfo(Integer id) {
        return ApiResponse.error(ErrorCode.SERVICE_FALLBACK);
    }

    @Override
    public ApiResponse<String> getPaymentInfoTimeOut(Integer id) {
        return ApiResponse.error(ErrorCode.SERVICE_FALLBACK);
    }
}
