package org.snut.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.snut.common.bo.CommonResult;
import org.snut.common.bo.PaymentBo;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author curtis
 * @date 2021/12/11
 * @description
 **/
@Slf4j
@RestController
public class OrderController {

    public static final String PaymentUrl = "http://SNUT-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/create")
    public CommonResult<PaymentBo> create(PaymentBo dto) {

        return restTemplate.postForObject(PaymentUrl + "/payment/create", dto, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<PaymentBo> getPayment(@PathVariable("id") Long id) {

        log.info("调用地址：" + PaymentUrl + "/payment/get/" + id);
        return restTemplate.getForObject(PaymentUrl + "/payment/get/" + id, CommonResult.class);
    }
}
