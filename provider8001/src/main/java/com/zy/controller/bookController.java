package com.zy.controller;

import com.zy.domain.BsBook;
import com.zy.mapper.BsBookMapper;
import com.zy.service.BsBookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @学习小结
 */
@RestController
public class bookController {
    @Resource
    BsBookMapper BsBookMapper;

    @GetMapping("/book1")
    public BsBook book1(){
        return BsBookMapper.selectById(31);
    }

    @GetMapping("/book2")
    public BsBook book2(){
        return BsBookMapper.selectById(32);
    }

    @GetMapping("/book3")
    public BsBook book3(){
        return BsBookMapper.selectById(33);
    }

    @GetMapping("/{id}")
    public BsBook getBook(@PathVariable("id") Integer id){
        return BsBookMapper.selectById(id);
    }

}
