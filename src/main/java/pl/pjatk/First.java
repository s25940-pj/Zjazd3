package pl.pjatk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class First {
    private String name;
    @Autowired
    private Second second;

    public First(Second second) {
        this.name = "First";
        System.out.println(this.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
