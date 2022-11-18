package com.zy.controller;

import com.zy.client.orderClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @学习小结
 */
@RestController
public class OrderController {
    @Resource
    orderClient orderClient;

    @GetMapping("/book1")
    public String book1(){
        return orderClient.book1();
    }


    @GetMapping("/book2")
    public String book2(){
        return orderClient.book2();
    }


}
