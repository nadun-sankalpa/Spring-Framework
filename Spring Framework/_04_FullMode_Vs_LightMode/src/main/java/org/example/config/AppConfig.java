package org.example.config;

import org.example.bean.SpringBeanThree;
import org.example.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.bean")
public class AppConfig {

//    @Bean
//    public SpringBeanTwo getSpringBeanOne() {
////        SpringBeanTwo springBeanTwo1 = getSpringBeanTwo();
////        SpringBeanTwo springBeanTwo2 = getSpringBeanTwo();
//
//        return new SpringBeanOne();
//    }
//
//    @Bean
//    public SpringBeanTwo getSpringBeanTwo() {
//        SpringBeanThree springBeanThree1 = getSpringBeanThree();
//        SpringBeanThree springBeanThree2 = getSpringBeanThree();
//        return new SpringBeanTwo();
//    }

  @Bean
  public SpringBeanThree getSpringBeanThree() {
        return new SpringBeanThree();
    }


}
