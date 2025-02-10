package lk.ijse.config;

import lk.ijse.bean.MyConnection;
import lk.ijse.bean.SpringBean;
import lk.ijse.bean.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
public class AppConfig {
    @Bean("mConnection")
    @Scope("prototype")
    MyConnection myConnection(){
        return new MyConnection();
    }
}
