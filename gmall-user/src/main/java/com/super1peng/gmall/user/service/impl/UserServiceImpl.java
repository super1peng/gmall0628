package com.super1peng.gmall.user.service.impl;


import com.super1peng.gmall.user.bean.UserInfo;
import com.super1peng.gmall.user.mapper.UserInfoMapper;
import com.super1peng.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> userInfoList(){
        return userInfoMapper.selectAll();
    }

}
