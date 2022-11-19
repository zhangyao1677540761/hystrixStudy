package com.zy.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @学习小结
 */
@FeignClient(value = "provide-8001",fallback = ClientFallBack.class)
public interface Client {

    @GetMapping("/book1")
    public String book1();

    @GetMapping("/book2")
    public String book2();




}
