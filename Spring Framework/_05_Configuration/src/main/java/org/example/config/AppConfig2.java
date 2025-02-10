package org.example.config;

import org.example.bean.SpringBean2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackageClasses = SpringBean2.class)
public class AppConfig2 {
}
