package org.snut.payment02.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.snut.common.entities.Payment;

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
