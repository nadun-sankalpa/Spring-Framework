package org.example;

import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
//        Map<String, String> getenv=System.getenv();
//        for (String key : getenv.keySet()) {
//            System.out.println(key + " = " + getenv.get(key));
//        }
        Properties properties = System.getProperties();
        for (String key : properties.stringPropertyNames()) {
            System.out.println(key + " : " + properties.get(key));
        }

        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        System.out.println("os name : " + osName);
        System.out.println("os version : " + osVersion);

        context.registerShutdownHook();
    }
}