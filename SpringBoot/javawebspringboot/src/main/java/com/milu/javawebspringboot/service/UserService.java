package com.milu.javawebspringboot.service;

import com.milu.javawebspringboot.po.User;

/**
 * @Auther Jack
 * @Date 2020/7/27
 */
public interface UserService {
    User checkUsers(String username,String password);
}
