package lk.ijse;

import lk.ijse.bean.MyConnection;
import lk.ijse.bean.SpringBean;
import lk.ijse.bean.TestBean1;
import lk.ijse.bean.TestBean2;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();


        SpringBean springBean = context.getBean(SpringBean.class);
        //SpringBean springBean = (SpringBean) context.getBean("springBean");
        System.out.println(springBean);

//        Runtime.getRuntime().addShutdownHook(new Thread(){
//            @Override
//            public void run() {
//                System.out.println("Shutting down..");
//                context.close();
//            }
//        });
        context.registerShutdownHook();

        springBean.testBean();


        TestBean1 testBean1 = context.getBean(TestBean1.class);

        System.out.println(testBean1);

//        TestBean2 testBean2 = (TestBean2) context.getBean("testBean2");
        TestBean2 testBean2 = context.getBean( TestBean2.class);
        System.out.println(testBean2);

        MyConnection myConnection = context.getBean(MyConnection.class);
        System.out.println(myConnection);
        MyConnection myConnection2 =(MyConnection) context.getBean("mConnection");
        System.out.println(myConnection2);

        TestBean1 ref1 = context.getBean(TestBean1.class);
        TestBean1 ref2 = context.getBean(TestBean1.class);
        System.out.println(ref1);
        System.out.println(ref2);

        TestBean2 ref3 = context.getBean(TestBean2.class);
        TestBean2 ref4 = context.getBean(TestBean2.class);
        System.out.println(ref3);
        System.out.println(ref4);

        MyConnection ref5 = context.getBean(MyConnection.class);
        MyConnection ref6 = context.getBean(MyConnection.class);
        System.out.println(ref5);
        System.out.println(ref6);





    }
}
