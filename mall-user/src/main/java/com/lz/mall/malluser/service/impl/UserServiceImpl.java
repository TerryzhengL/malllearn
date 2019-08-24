package com.lz.mall.malluser.service.impl;

import com.lz.mall.malluser.mapper.UserMapper;
import com.lz.mall.malluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
}
