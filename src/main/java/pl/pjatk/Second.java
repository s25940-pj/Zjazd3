package pl.pjatk;

import org.springframework.stereotype.Component;

@Component
public class Second {
    private String name;

    public Second() {
        this.name = "Second";
        System.out.println(this.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
