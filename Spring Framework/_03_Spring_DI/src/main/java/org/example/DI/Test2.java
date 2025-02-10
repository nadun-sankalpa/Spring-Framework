package org.example.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test2 {
   // @Autowired
    DI test1;

    //@Autowired
    public Test2(DI test1){
        System.out.println("Test 2 created");
        //this.test1 = test1;
    }
    public void display(){
        setTest1(test1);
       test1.sayHello();

    }
    @Autowired
    public void setTest1(DI test1){
        this.test1 = test1;
    }
}
