package com.zy.controller;

import com.zy.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @学习小结
 */
@RestController
public class orderController {

    @Autowired
    Client client;

    @GetMapping("/book1")
    public String book1(){
//        int i = 41/0;
        return client.book1();
    }


    @GetMapping("/book2")
    public String book2(){
        return client.book2();
    }

}
