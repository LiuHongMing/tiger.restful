package demo.springframework.context;

import org.springframework.context.ApplicationEvent;

public class PropertyGettedEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public PropertyGettedEvent(Object source) {
        super(source);
    }
}
