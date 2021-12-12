package org.snut.payment01.service;

import org.snut.common.entities.Payment;

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
