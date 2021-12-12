package org.snut.payment01.service.impl;

import org.snut.payment01.dao.PaymentDao;
import org.snut.common.entities.Payment;
import org.snut.payment01.service.PaymentService;
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
