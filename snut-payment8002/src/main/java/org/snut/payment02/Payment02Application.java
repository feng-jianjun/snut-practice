package org.snut.payment02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author curtis
 * @date 2021/12/9
 * @description
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Payment02Application {
    public static void main(String[] args) {

        SpringApplication.run(Payment02Application.class, args);
    }
}
