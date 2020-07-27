package com.milu.javawebspringboot.dao;

import com.milu.javawebspringboot.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther Jack
 * @Date 2020/7/27
 */
public interface TypeRepository extends JpaRepository<Type,Long> {

}
