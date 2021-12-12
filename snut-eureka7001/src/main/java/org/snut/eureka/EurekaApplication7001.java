package org.snut.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author curtis
 * @date 2021/12/11
 * @description
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication7001 {

    public static void main(String[] args) {

        SpringApplication.run(EurekaApplication7001.class, args);
    }
}
