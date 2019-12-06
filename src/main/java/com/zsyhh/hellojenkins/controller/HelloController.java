package com.zsyhh.hellojenkins.controller;

import com.zsyhh.hellojenkins.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/get")
    public User get(){
        return User.builder().name("zsyh").id(123456).build();
    }
}
