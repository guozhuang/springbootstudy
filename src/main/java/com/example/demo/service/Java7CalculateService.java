package com.example.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("java7")
@Service
public class Java7CalculateService implements CalculateService{

    @Override
    public Integer sum(Integer... values) {
        int sum = 0;

        System.out.println("this is java7");
        for (Integer i=0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Java7CalculateService calculateService = new Java7CalculateService();

        Integer re = calculateService.sum(1,2,3,4,5,6,7,8,9,10);

        System.out.println(re);
    }
}
