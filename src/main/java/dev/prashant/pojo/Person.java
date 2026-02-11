package dev.prashant.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
//    @Autowired - for field injection
    private Car car;

    public Person(){
        System.out.println("Car initialized- no arg constructor");
    }

    @Autowired
    public Person(Car car){
        this.car=car;
        System.out.println("Constructor injection");
    }

//    @Autowired - for setter injection
//    public void setCar(Car car) {
//        this.car = car;
//    }

    public void drive(){
        car.start();
    }
}
