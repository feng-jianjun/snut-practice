package org.snut.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.snut.order.dto.CommonResult;
import org.snut.order.dto.PaymentDto;
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

    public static final String PaymentUrl = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/create")
    public CommonResult<PaymentDto> create(PaymentDto dto) {

        return restTemplate.postForObject(PaymentUrl + "/payment/create", dto, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<PaymentDto> getPayment(@PathVariable("id") Long id) {

        log.info("调用地址：" + PaymentUrl + "/payment/get/" + id);
        return restTemplate.getForObject(PaymentUrl + "/payment/get/" + id, CommonResult.class);
    }
}
