package dev.prashant.pojo;

import dev.prashant.VehicleService.Vehicle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
//    Engine engine;
    private String name;

    // constructor injection
//    public Car(Engine engine){
//        System.out.println("Car Object created");
//        this.engine=engine;
//        System.out.println("Engine initialized in car");
//    }

    public Car(@Value(value = "swift dezire") String name){
        this.name=name;
    }

    @Override
    public void start(){
        System.out.println("Car Started");
    }

    @Override
    public void details() {
        System.out.println("Car name : "+name);
    }
}
