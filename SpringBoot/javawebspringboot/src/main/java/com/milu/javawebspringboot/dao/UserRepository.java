package com.milu.javawebspringboot.dao;

import com.milu.javawebspringboot.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther Jack
 * @Date 2020/7/27
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsernameAndPassword(String username ,String password);
}
