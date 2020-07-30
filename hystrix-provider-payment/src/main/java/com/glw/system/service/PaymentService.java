package com.glw.system.service;

import com.glw.system.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author : glw
 * @date : 2020/3/28
 * @time : 0:23
 * @Description : 支付业务层接口
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

    String getPaymentInfo(Integer id);

    String getPaymentInfoTimeOut(Integer id);

    String getPaymentInfoTimeOutHandler(Integer id);

}
