package org.example.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class SpringBean {
    public SpringBean(){
        System.out.println("Spring Bean Object is Created");
    }
}
