package com.zy.client;

import com.zy.domain.BsBook;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @学习小结
 */
@FeignClient(value = "provide-8001")
public interface FeignUse {

    @GetMapping("/book1")
    public BsBook book1();

    @GetMapping("/book2")
    public BsBook book2();

    @GetMapping("/book3")
    public BsBook book3();

    @GetMapping("/{id}")
    public BsBook getBook(@PathVariable("id") Integer id);


}
