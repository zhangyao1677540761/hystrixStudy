package com.zy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zy.domain.BsBook;
import com.zy.service.BsBookService;
import com.zy.mapper.BsBookMapper;
import org.springframework.stereotype.Service;


/**
*
*/
@Service
public class BsBookServiceImpl extends ServiceImpl<BsBookMapper, BsBook>
implements BsBookService{

    @Override
    public BsBook getBsBook() {
        return this.getById(1);
    }

}
