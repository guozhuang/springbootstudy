package com.example.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Profile("java8")
@Service
public class Java8CalculateService implements CalculateService{

    @Override
    public Integer sum(Integer... values) {
        //使用lambda方式
        System.out.println("this is java8");
        int sum = Stream.of(values).reduce(0, Integer::sum);
        return sum;
    }

    public static void main(String[] args) {
        Java8CalculateService calculateService = new Java8CalculateService();

        Integer re = calculateService.sum(1,2,3,4,5,6,7,8,9,10);

        System.out.println(re);
    }
}
