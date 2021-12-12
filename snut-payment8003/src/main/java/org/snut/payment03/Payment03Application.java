package org.snut.payment03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author curtis
 * @date 2021/12/12
 * @description
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Payment03Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment03Application.class,args);
    }
}
