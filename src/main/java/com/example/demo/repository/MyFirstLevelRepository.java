package com.example.demo.repository;

import com.example.demo.annotation.FirstLevelRepository;

//对应于注解的使用
@FirstLevelRepository(value = "myFirstLevelRepository")//这里是自己新建的注解
public class MyFirstLevelRepository {


    public String valueRes(String arg) {
        return arg + " repository";
    }
}
