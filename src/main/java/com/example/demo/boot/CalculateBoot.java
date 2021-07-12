package com.example.demo.boot;


import com.example.demo.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 计算器的引导类【适配@Profile】
 */

@SpringBootApplication(scanBasePackages = "com.example.demo.service")
public class CalculateBoot {

    public static void main(String[] args) {
        //创建上下文
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateBoot.class)
                .web(WebApplicationType.NONE)
                .profiles("java7")//这里设置就可以控制相应的装载【使用profile，对应设置服务的profile声明】
                .run(args)
                ;

        CalculateService calculateService = context.getBean(CalculateService.class);

        System.out.println("cal re: "+ calculateService.sum(1,2,3,4,5));

        context.close();
    }
}
