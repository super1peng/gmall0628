package com.super1peng.gmall.user.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.super1peng.gmall.bean.UserAddress;
import com.super1peng.gmall.bean.UserInfo;
import com.super1peng.gmall.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("userInfoList")
    public ResponseEntity<List<UserInfo>> userInfoList(HttpServletRequest request){
        List<UserInfo> userInfoList = userService.userInfoList();
        return ResponseEntity.ok(userInfoList);
    }

    @RequestMapping("getAddressListByUser")
    public ResponseEntity<List<UserAddress>> getAddressListByUser(String userId){
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);

        return ResponseEntity.ok(userAddressList);
    }

}
