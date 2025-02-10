package org.example;

import org.example.bean.SpringBean;
import org.example.config.AppConfig;
import org.example.config.AppConfig1;
import org.example.config.AppConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
       context.register(AppConfig1.class);
        context.register(AppConfig.class);
        context.register(AppConfig2.class);
        context.refresh();

        SpringBean springBean = context.getBean(SpringBean.class);
        System.out.println(springBean);
        SpringBean springBean1 = context.getBean(SpringBean.class);
        System.out.println(springBean1);
        SpringBean springBean2 = context.getBean(SpringBean.class);
        System.out.println(springBean2);
        context.registerShutdownHook();
    }
}