package org.snut.payment02.controller;


import lombok.extern.slf4j.Slf4j;
import org.snut.common.bo.CommonResult;
import org.snut.common.entities.Payment;
import org.snut.payment02.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author curtis
 * @date 2021/12/11
 * @description
 **/
@Slf4j
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment entity) {

        int id = paymentService.create(entity);

        log.info("**********插入结果：" + id);

        if (id > 0) {
            return new CommonResult(200, "插入数据库成功,Port：" + serverPort, id);
        } else {
            return new CommonResult(500, "插入数据库失败,Port：" + serverPort, null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {

        Payment payment = paymentService.selectOneById(id);
        log.info("**********查询结果：" + payment);
        if (null != payment) {

            return new CommonResult(200, "查询成功,Port：" + serverPort, payment);
        } else {

            return new CommonResult(500, "没有对应的记录,Port：" + serverPort, null);
        }
    }

    @GetMapping(value = "/payment/servers")
    public CommonResult<List<String>> getAllServers(){
        List<String> servers = discoveryClient.getServices();
        return new CommonResult<>(200,"已注册的所有服务：",servers);
    }

    @GetMapping(value = "/payment/instances")
    public CommonResult<List<String>> getAllInstances(){
        List<String> res = new ArrayList<>();
        for (String service : discoveryClient.getServices()) {
            for (ServiceInstance instance : discoveryClient.getInstances(service)) {
                res.add("服务名："+service+"，实例："+instance.getInstanceId()+"，Host："+instance.getHost()+"，Port："+instance.getPort());
            }
        }
        return new CommonResult<>(200,"已注册的所有服务的详细信息：",res);
    }
}
