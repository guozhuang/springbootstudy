package com.example.demo.condition;

import org.springframework.boot.autoconfigure.condition.OnPropertyListCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * 自定义根据系统属性进行条件判断
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnSystemPropertyCondition.class)//此处就是永乐@Conditional注解的核心
//将实现了Condition接口的类传入@Conditional中，即可获得相应的bean
//而显然，入口函数那里已经将该类传入类对应的参数，只需要这些参数对应于当前标准声明的方法即可
public @interface ConditionalOnSystemProperty {

    //进行系统匹配时的标准处理
    String name();

    String value();
}

