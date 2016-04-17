package junit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExmaple {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:spring/zookeeper-context.xml");
        ctx.start();
    }

}
