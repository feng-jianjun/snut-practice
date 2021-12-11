package org.snut.payment.controller;

import lombok.extern.slf4j.Slf4j;
import org.snut.payment.dto.CommonResult;
import org.snut.payment.entities.Payment;
import org.snut.payment.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author curtis
 * @date 2021/12/11
 * @description
 **/
@Slf4j
@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment entity) {

        int id = paymentService.create(entity);

        log.info("**********插入结果：" + id);

        if (id > 0) {
            return new CommonResult(200, "插入数据库成功", id);
        } else {
            return new CommonResult(500, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {

        Payment payment = paymentService.selectOneById(id);
        log.info("**********查询结果：" + payment);
        if (null != payment) {

            return new CommonResult(200, "查询成功", payment);
        } else {

            return new CommonResult(500, "没有对应的记录", null);
        }
    }
}
