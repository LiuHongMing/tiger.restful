package demo.beans;

import demo.springframework.context.PropertyGettedEvent;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloBean implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    private String helloworld;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public String getHelloworld() {
        applicationContext.publishEvent(new PropertyGettedEvent("{" + helloworld + "} is getted"));
        return helloworld;
    }

    public void setHelloworld(String helloworld) {
        this.helloworld = helloworld;
    }

}
