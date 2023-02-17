package com.sparkisland.spark.controller;

import com.sparkisland.spark.entity.User;
import com.sparkisland.spark.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // 标识UserController是一个接口
@RequestMapping("/user") // 给接口加前缀做拼接
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @PostMapping("/") // post请求方法

    @GetMapping("/") //get请求方法
    public List<User> index() {

        return userMapper.findAll();
    }


}
