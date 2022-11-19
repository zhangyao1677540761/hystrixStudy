//package com.zy.client;
//
//import cn.hutool.core.util.IdUtil;
//import com.zy.domain.BsBook;
//import org.springframework.cloud.commons.util.IdUtils;
//import org.springframework.stereotype.Component;
//
///**
// * @学习小结
// */
//@Component
//public class ClientFallBack implements Client{
//    String s = IdUtil.simpleUUID();
//    @Override
//    public BsBook book1() {
//
//        BsBook book = new BsBook();
//        book.setTitle("出错了"+s);
//        return book;
//    }
//
//    @Override
//    public BsBook book2() {
//        BsBook book = new BsBook();
//        book.setTitle("出错了"+s);
//        return book;
//    }
//
//    @Override
//    public BsBook book3() {
//        BsBook book = new BsBook();
//        book.setTitle("出错了"+s);
//        return book;
//    }
//}
