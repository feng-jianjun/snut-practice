package org.snut.payment.service;

import org.apache.ibatis.annotations.Param;
import org.snut.payment.entities.Payment;
import org.springframework.stereotype.Service;

/**
 * @author curtis
 * @date 2021/12/11
 * @description
 **/
public interface PaymentService {

    /**
     * 插入数据
     *
     * @param entity
     * @return
     */
    int create(Payment entity);

    /**
     * 根据ID获取一条数据
     *
     * @param id
     * @return
     */
    Payment selectOneById(Long id);
}
