package dev.prashant;

import dev.prashant.config.MyConfiguration;
import dev.prashant.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

        Person person=(Person) context.getBean(Person.class);

        person.drive();
    }
}
