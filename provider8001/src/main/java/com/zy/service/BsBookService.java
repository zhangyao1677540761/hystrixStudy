package com.zy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zy.domain.BsBook;

/**
*
*/
public interface BsBookService extends IService<BsBook> {

    BsBook getBsBook();
}
