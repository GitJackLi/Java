package com.milu.javawebspringboot.service.impl;

import com.milu.javawebspringboot.dao.UserRepository;
import com.milu.javawebspringboot.po.User;
import com.milu.javawebspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther Jack
 * @Date 2020/7/27
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User checkUsers(String username, String password) {
        return userRepository.findByUsernameAndPassword(username,password);
    }
}
