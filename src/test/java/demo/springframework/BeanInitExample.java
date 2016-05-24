package demo.springframework;

import demo.beans.MyJavaBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInitExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");
        MyJavaBean bean = applicationContext.getBean(MyJavaBean.class);
        System.out.println(bean);
    }

}
