package org.snut.payment03.service.impl;

import org.snut.common.entities.Payment;
import org.snut.payment03.dao.PaymentDao;
import org.snut.payment03.service.PaymentService;
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
