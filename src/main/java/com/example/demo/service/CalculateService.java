package com.example.demo.service;

/**
 * 简单自定义一个服务
 */
public interface CalculateService {

    //定义一个接口

    /**
     *多数相加
     * @param values
     * @return
     */
    Integer sum(Integer... values);
}
