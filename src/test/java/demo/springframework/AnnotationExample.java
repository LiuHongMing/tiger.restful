package demo.springframework;

import demo.annotations.UserDaoProcessor;
import demo.beans.House;
import demo.beans.Person;
import demo.utils.SpringUtil;
import org.springframework.context.ApplicationContext;

public class AnnotationExample {

    public static void main(String[] args) {
        ApplicationContext context = SpringUtil.getAnnotationConfigApplicationContext("demo.beans", "demo.annotations");

        House house = (House) context.getBean("house");
        Person person = house.getOwner();
        person.setName("哒哒");
        System.out.println(house.getOwner().getName());

        UserDaoProcessor processor = (UserDaoProcessor) context.getBean("userDaoProcessor");
        System.out.println(processor.getCount());
    }

}
