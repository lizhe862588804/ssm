package com.alibaba.controller;

import com.alibaba.service.UserService;

public class UserController {

    public String getUserInfo(){
        UserService userService = new UserService();

        return  userService.getUserInfo();
    }
}
