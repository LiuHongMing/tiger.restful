package demo.springframework.context;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class PropertyGettedListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event.getSource().toString());
    }
}
