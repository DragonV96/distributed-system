package com.glw.system.dao;

import com.glw.system.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : glw
 * @date : 2020/3/27
 * @time : 23:40
 * @Description : 支付DAO
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
