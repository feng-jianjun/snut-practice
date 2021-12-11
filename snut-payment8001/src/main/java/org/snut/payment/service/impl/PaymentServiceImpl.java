package org.snut.payment.service.impl;

import org.snut.payment.dao.PaymentDao;
import org.snut.payment.entities.Payment;
import org.snut.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author curtis
 * @date 2021/12/11
 * @description
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment entity) {

        return paymentDao.create(entity);
    }

    @Override
    public Payment selectOneById(Long id) {

        return paymentDao.selectOneById(id);
    }
}
