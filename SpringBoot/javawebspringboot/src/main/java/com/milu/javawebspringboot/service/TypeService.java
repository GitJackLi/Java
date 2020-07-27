package com.milu.javawebspringboot.service;

import com.milu.javawebspringboot.po.Type;
import com.milu.javawebspringboot.po.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 * @Auther Jack
 * @Date 2020/7/27
 */
public interface TypeService {
    Page<Type> ListType(Pageable pageable);
}
