package demo.springframework;

import demo.beans.HelloBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        HelloBean helloBean = applicationContext.getBean(HelloBean.class);
        System.out.println(helloBean.getHelloworld());
    }

}
