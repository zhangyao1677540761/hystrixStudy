package com.zy.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @学习小结
 */
@FeignClient(value = "provide-8001",fallback = ClientFallBack.class)
public interface Client {

    @GetMapping("/book1")
//    @HystrixCommand(fallbackMethod = "FallbackMethod",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds"
//                    ,value = "3000")
//    })//必须是在同一个类中的方法,HystrixProperty是触发条件
    public String book1();


    @GetMapping("/book2")
    public String book2();




}
