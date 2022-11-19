package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.annotation.security.RunAs;

/**
 * @学习小结
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class HOApplication {
    public static void main(String[] args) {
        SpringApplication.run(HOApplication.class, args);
    }
}