package demo.beans;

import javax.inject.Named;

@Named
public class Person {

    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person() {
        System.out.println("===人的构造函数===");

    }

}
