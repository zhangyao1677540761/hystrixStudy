package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @学习小结
 */
@SpringBootApplication
@EnableDiscoveryClient   //开启服务发现客户端,别的注册中心也支持
//@EnableEurekaClient 只支持eureka
public class provide8001 {
    public static void main(String[] args) {
        SpringApplication.run(provide8001.class, args);
    }
}

