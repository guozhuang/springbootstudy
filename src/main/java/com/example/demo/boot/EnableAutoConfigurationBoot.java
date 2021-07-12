package com.example.demo.boot;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 自定义自动加载入口
 */
@EnableAutoConfiguration
public class EnableAutoConfigurationBoot {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(EnableAutoConfigurationBoot.class)
                        .web(WebApplicationType.NONE)
                        .run(args);

        //检测自动装载
        //debug模式运行时，确认condition判断逻辑和enable下的selector以及configuration的逻辑断点都有执行
        //验证自动加载成功

        //enable检查
        String helloWorld = context.getBean("helloWorldEnable", String.class);

        System.out.println("enable:" + helloWorld);

        //conditional检查：这里确实有问题，实际上helloWorld并没有转换成bean
        /*String helloCondition = context.getBean("helloWorld", String.class);

        System.out.println("opt bean:"+helloCondition);*/

        //关闭上下文
        context.close();
    }
}
