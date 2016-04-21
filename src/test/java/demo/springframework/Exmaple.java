package demo.springframework;

import demo.beans.House;
import demo.beans.Person;
import demo.utils.SpringUtil;
import org.springframework.context.ApplicationContext;

public class Exmaple {

    public static void main(String[] args) {
        ApplicationContext context = SpringUtil.getAnnotationConfigApplicationContext("demo.beans");

        House house = (House) context.getBean("house");
        Person person = house.getOwner();
        person.setName("哒哒");
        System.out.println(house.getOwner().getName());
    }

}
