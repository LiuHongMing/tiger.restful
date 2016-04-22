package demo.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringUtil {

    public static ApplicationContext getAnnotationConfigApplicationContext(String... basePackages) {
        return new AnnotationConfigApplicationContext(basePackages);
    }

}
