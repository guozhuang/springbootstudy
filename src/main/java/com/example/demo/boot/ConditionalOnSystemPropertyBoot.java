package com.example.demo.boot;

import com.example.demo.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.condition.OnPropertyListCondition;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

//@ConditionalOnSystemProperty(name = "user", value="gz")//此处注入自定义的条件判断类，以及对应标准的参数
//该类因为实现的condition，而声明的标准中
public class ConditionalOnSystemPropertyBoot {

    @Bean
    @ConditionalOnSystemProperty(name = "user.name", value="momo")
    public String helloWorld(){
        //根据条件装载转换相应的bean，并且判断matches方法的结果转换。成功然后再返回结果
        return "hello condition";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBoot.class)
                .web(WebApplicationType.NONE)
                .run(args)
                ;

        String helloCondition = context.getBean("helloWorld", String.class);

        System.out.println("opt bean:"+helloCondition);

        context.close();

    }
}
