package demo.beans;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class House {

    @Inject public Person owner;

    @Inject
    public House(Person owner) {
        System.out.println("===房屋的构造函数===");
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    @Inject
    public void setOwner(Person owner) {
        this.owner = owner;
    }

}
