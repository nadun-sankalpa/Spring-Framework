package org.example.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {
    @Value("${os.name}")
    private String osName;
    @Value("${USERDOMAIN}")
    private String userDomain;
    @Value("${database.username}")
    private String userName;
    @Value("${appuser}")
    private String appUser;
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);
        System.out.println(userDomain);
        System.out.println(userName);
        System.out.println(appUser);

    }
}
