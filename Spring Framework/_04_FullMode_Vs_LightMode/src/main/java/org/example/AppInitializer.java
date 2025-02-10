package org.example;

import org.example.bean.SpringBeanOne;
import org.example.bean.SpringBeanTwo;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
//
//        SpringBeanOne springBeanOne = context.getBean(SpringBeanOne.class);
//        SpringBeanTwo springBeanTwo = context.getBean(SpringBeanTwo.class);
//
//        System.out.println(springBeanOne);
//        System.out.println(springBeanTwo);

        SpringBeanTwo bean1 = context.getBean(SpringBeanTwo.class);
        SpringBeanTwo bean2 = context.getBean(SpringBeanTwo.class);
        System.out.println(bean1);
        System.out.println(bean2);

        context.registerShutdownHook();



    }
}