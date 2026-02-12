package dev.prashant.pojo;

import dev.prashant.VehicleService.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private final Vehicle vehicle;

    @Value(value = "${appname}")        // ${} -> expression language
    private String appname;

    @Value(value = "${appversion}")
    private String appversion;

    public Person(Vehicle vehicle){
        this.vehicle=vehicle;
    }

    public void drive(){
        System.out.println("App name : "+appname+"\nversion : "+appversion);
        System.out.println("Inside Person - drive()");
        vehicle.start();
    }

//    @Autowired - for field injection
//    private Car car;

//    @Autowired
//    @Qualifier(value = "car")   // Qualifier has more priority than Primary


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


}
