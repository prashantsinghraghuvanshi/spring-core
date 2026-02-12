package dev.prashant.pojo;

import dev.prashant.VehicleService.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
//    @Autowired - for field injection
//    private Car car;

//    @Autowired
//    @Qualifier(value = "car")   // Qualifier has more priority than Primary
    private final Vehicle vehicle;

    public Person(@Qualifier(value = "car") Vehicle vehicle){
        this.vehicle=vehicle;
    }

//    public Person(){
//        System.out.println("Car initialized- no arg constructor");
//    }

//    @Autowired
//    public Person(Car car){
//        this.car=car;
//        System.out.println("Constructor injection");
//    }

//    @Autowired - for setter injection
//    public void setCar(Car car) {
//        this.car = car;
//    }

    public void drive(){
        System.out.println("Inside Person - drive()");
        vehicle.start();
    }
}
