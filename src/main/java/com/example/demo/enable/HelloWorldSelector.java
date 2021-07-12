package com.example.demo.enable;

import com.example.demo.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class HelloWorldSelector implements  ImportSelector{

    @Override
    public String[] selectImports(AnnotationMetadata metadata) {
        return new String[]{
                HelloWorldConfiguration.class.getName()
        };
    }
}
