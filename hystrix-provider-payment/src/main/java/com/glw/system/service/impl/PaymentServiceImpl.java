package com.glw.system.service.impl;

import com.glw.system.dao.PaymentDao;
import com.glw.system.entity.Payment;
import com.glw.system.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

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

    @Override
    public String getPaymentInfo(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " getPaymentInfo，id = " + id + " xxxxxxx";
    }

    @Override
    public String getPaymentInfoTimeOut(Integer id) {
        int time = 3;
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + " getPaymentInfoTimeOut，id = " + id + " xxxxxxx 耗时" + time + "s";
    }
}
