package com.example.demo.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

//解释手动注解的使用
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository//此处注解可以查看原生部分存在@Component注解，
// 于是当前的注解也可以看作是Repository的派生注解，
// 于是也可以看作是被@Component注解过
public @interface FirstLevelRepository {

    String value() default "";//而且这里也带了value这个签名，所以正常使用
}
