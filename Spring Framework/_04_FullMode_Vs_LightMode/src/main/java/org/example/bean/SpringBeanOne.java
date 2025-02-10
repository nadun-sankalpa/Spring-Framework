package org.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements BeanNameAware , ApplicationContextAware {


    @Bean
    public SpringBeanTwo getSpringBeanTwo() {
        SpringBeanThree springBeanThree1 = SpringBeanThree();
        SpringBeanThree springBeanThree2 = SpringBeanThree();
        System.out.println(springBeanThree1);
        System.out.println(springBeanThree2);
        return new SpringBeanTwo();
    }

    public SpringBeanThree getSpringBeanThree() {
        return new SpringBeanThree();
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
