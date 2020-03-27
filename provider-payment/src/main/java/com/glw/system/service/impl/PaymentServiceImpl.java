package com.glw.system.service.impl;

import com.glw.system.dao.PaymentDao;
import com.glw.system.entity.Payment;
import com.glw.system.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : glw
 * @date : 2020/3/28
 * @time : 0:24
 * @Description : 支付业务层实现
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
