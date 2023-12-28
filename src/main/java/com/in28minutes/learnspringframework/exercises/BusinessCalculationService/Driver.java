package com.in28minutes.learnspringframework.exercises.BusinessCalculationService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Driver {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BusinessCalculationService.class);
        System.out.println(context.getBean(BusinessCalculationService.class).findMax());
    }
}
