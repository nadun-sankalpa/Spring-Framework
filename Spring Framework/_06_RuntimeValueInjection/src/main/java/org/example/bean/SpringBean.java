package org.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {

    public SpringBean() {
        System.out.println("Spring Bean is created");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean is created");
    }

//    public SpringBean(@Value("Nadun Sankalpa") String name,@Value("1") int id, @Value("true") boolean course) {
//        System.out.println("Spring Bean is created");
//        System.out.println(name);
//        System.out.println(id);
//        System.out.println(course);
//    }
//    @Autowired
//    public SpringBean(@Value("Nadun Sankalpa") String name,@Value("1") int id) {
//        System.out.println("Spring Bean is created");
//        System.out.println(name);
//        System.out.println(id);
//
//    }
}
