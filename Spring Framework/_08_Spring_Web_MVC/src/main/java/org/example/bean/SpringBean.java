package org.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean() {
        System.out.println("Spring Bean is created");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory set");

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name set");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean is destroyed");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is initialized");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext set");

    }
}
