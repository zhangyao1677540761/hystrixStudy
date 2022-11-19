package com.zy.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

/**
 * @学习小结
 */
@Component
public class ClientFallBack implements Client{
    @Override
    public String book1() {
        return "出错了,出错了";
    }

    @Override
    public String book2() {
        return "出错了,出错了";
    }
}
