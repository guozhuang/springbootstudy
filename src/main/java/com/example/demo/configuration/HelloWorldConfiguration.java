package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;

public class HelloWorldConfiguration {

    //进行bean转化声明
    @Bean
    public String helloWorldEnable(){
        return "this is hello world bean tran";
    }
}
