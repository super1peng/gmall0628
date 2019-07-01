package com.super1peng.gmall.service;

import com.super1peng.gmall.bean.UserAddress;
import com.super1peng.gmall.bean.UserInfo;

import java.util.List;

public interface UserService {
    List<UserInfo> userInfoList();

    List<UserAddress> getUserAddressList(String userId);

    UserAddress getUserAddressByAddressId(String deliveryAddress);

}
