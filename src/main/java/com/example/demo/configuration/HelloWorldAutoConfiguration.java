package com.example.demo.configuration;

import com.example.demo.condition.ConditionalOnSystemProperty;
import com.example.demo.enable.EnableHelloWorld;
import org.springframework.context.annotation.Configuration;

/**
 * 实现自定义自动装配的类
 */
@Configuration//使用spring自动注解【保证spring的正常引入】
@EnableHelloWorld//spring Enable 模块装配
@ConditionalOnSystemProperty(name = "user.name", value="momo")//条件装配
public class HelloWorldAutoConfiguration {
}
