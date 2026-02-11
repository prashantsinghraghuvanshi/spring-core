package dev.prashant.pojo;

import dev.prashant.VehicleService.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
//    Engine engine;

    // constructor injection
//    public Car(Engine engine){
//        System.out.println("Car Object created");
//        this.engine=engine;
//        System.out.println("Engine initialized in car");
//    }

    public Car(){}

    @Override
    public void start(){
        System.out.println("Car Started");
    }
}
