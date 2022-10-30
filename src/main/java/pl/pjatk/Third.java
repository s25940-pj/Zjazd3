package pl.pjatk;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Third {
    private String name;
    ApplicationContext applicationContext;

    public Third(ApplicationContext applicationContext) {
        this.name = "Third";
        this.applicationContext = applicationContext;

        First first = applicationContext.getBean("first", First.class);
    }
}
