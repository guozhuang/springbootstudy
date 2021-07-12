package com.example.demo.boot;

import com.example.demo.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.condition.OnPropertyListCondition;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@ConditionalOnSystemProperty(name = "user", value="gz")//此处注入自定义的条件判断类
//该类因为实现的condition，而声明的标准中
public class ConditionalOnSystemPropertyBoot {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBoot.class)
                .web(WebApplicationType.NONE)
                .run(args)
                ;

        context.close();

    }
}
