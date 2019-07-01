package com.super1peng.gmall.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.super1peng.gmall.bean.UserAddress;
import com.super1peng.gmall.bean.UserInfo;
import com.super1peng.gmall.service.UserService;
import com.super1peng.gmall.user.mapper.UserAddressMapper;
import com.super1peng.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


// 注意这里要改成dubbo的service，这个需要其他服务进行远程调用
@Service
public class UserServiceImpl implements UserService {

    // 这个注解还是spring的，因为在spring容器中有，进行内部调用
    @Autowired
    UserInfoMapper userInfoMapper;

//    接口方法重写
    @Autowired
    UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> userInfoList(){
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        List<UserAddress> select = userAddressMapper.select(userAddress);
        return select;
    }

    @Override
    public UserAddress getUserAddressByAddressId(String deliveryAddress){
        UserAddress userAddress = new UserAddress();
        userAddress.setId(deliveryAddress);
        return userAddressMapper.selectOne(userAddress);
    }

}
