package com.example.demo.boot;

import com.example.demo.repository.MyFirstLevelRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//扫描repository包下的类，该类都会被看作是Bean【需要注意bean的作用】
@ComponentScan(basePackages = "com.example.demo.repository")
public class RepositoryBoot {

    public static void main(String[] args){

        //创建application上下文[不直接使用springbootApplication引导]
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(RepositoryBoot.class)
                        .web(WebApplicationType.NONE)
                        .run(args);

        //查看
        MyFirstLevelRepository myFirstLevelRepository =
                context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);

        System.out.println("myFirstLevelRepository Bean:" +myFirstLevelRepository.valueRes("hello"));//
        //关闭上下文
        context.close();
    }
}
