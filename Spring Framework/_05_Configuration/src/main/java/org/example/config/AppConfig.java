package org.example.config;

import org.example.bean.SpringBean;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan(basePackages = "org.example")
@Import({AppConfig1.class, AppConfig2.class})

//how to configure with xml file
@ImportResource("classpath:applicationContext.xml")
//if not
@ImportResource("classpath:applicationContext2.xml")
public class AppConfig {

    @Bean
    public SpringBean springBean() {
        return new SpringBean();
    }
}
