package com.super1peng.gmall.user.controller;


import com.super1peng.gmall.user.bean.UserInfo;
import com.super1peng.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserConroller {

    @Autowired
    UserService userService;


    @RequestMapping("userInfoList")
//    @ResponseBody
    public ResponseEntity<List<UserInfo>> userInfoList(){
        List<UserInfo> userInfoList = userService.userInfoList();

//        return userInfoList;
        return ResponseEntity.ok(userInfoList);
    }

}
