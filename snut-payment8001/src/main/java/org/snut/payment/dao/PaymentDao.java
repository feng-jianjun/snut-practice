package org.snut.payment.dao;

import org.snut.payment.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author curtis
 * @date 2021/12/11
 * @description
 **/
@Mapper
public interface PaymentDao {
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
    Payment selectOneById(@Param("id") Long id);
}
