package com.example.demo.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

//实现当前包内的环境判断的标准接口
public class OnSystemPropertyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context,
                           AnnotatedTypeMetadata metadata){

        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());
        //查看断点结果attributes得到相应的name和value设置
        //这里的元数据就能够获取了
        //进行条件判断
        String propertyName= String.valueOf(attributes.get("name"));
        String propertyValue = String.valueOf(attributes.get("value"));

        //参照java环境
        String javaPropertyName = System.getProperty(propertyName);

        return propertyValue.equals(javaPropertyName);//判断结果
    }
}
