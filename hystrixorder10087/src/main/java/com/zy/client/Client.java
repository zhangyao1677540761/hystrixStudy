package com.zy.client;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @学习小结
 */
@FeignClient(value = "provide-8001",fallback = ClientFallBack.class)
public interface Client {

//    只用在被兜底方法上添加@HystrixCommand注解，不需要在@HystrixCommand注解中标明任何属性。并在所在类上添加：
//    @DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")


    @GetMapping("/book1")
//    @HystrixCommand(fallbackMethod = "FallbackMethod",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds"
//                    ,value = "3000")
//    })//必须是在同一个类中的方法,HystrixProperty是触发条件
    public String book1();


    @GetMapping("/book2")
    public String book2();




}
