package com.milu.javawebspringboot.service.impl;

import com.milu.javawebspringboot.dao.TypeRepository;
import com.milu.javawebspringboot.po.Type;
import com.milu.javawebspringboot.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


/**
 * @Auther Jack
 * @Date 2020/7/27
 */
@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeRepository typeRepository;


    @Override
    public Page<Type> ListType(Pageable pageable) {
        return typeRepository.findAll(pageable);
    }
}
