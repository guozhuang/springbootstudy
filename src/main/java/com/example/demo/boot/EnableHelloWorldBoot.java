package com.example.demo.boot;


import com.example.demo.enable.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableHelloWorld
public class EnableHelloWorldBoot {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(EnableHelloWorldBoot.class)
                        .web(WebApplicationType.NONE)
                        .run(args);

        String helloWorld = context.getBean("helloWorldEnable", String.class);

        System.out.println("enable:" + helloWorld);
        //关闭上下文
        context.close();
    }
}
