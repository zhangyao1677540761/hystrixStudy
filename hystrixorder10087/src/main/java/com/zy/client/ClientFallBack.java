package com.zy.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zy.domain.BsBook;
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

    @Override
    public BsBook book3() {
        return null;
    }
}
