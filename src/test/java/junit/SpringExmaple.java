package junit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExmaple {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:spring/zookeeper-context.xml");
    }

}
