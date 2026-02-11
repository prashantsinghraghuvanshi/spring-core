package dev.prashant.pojo;

import dev.prashant.VehicleService.Vehicle;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike Started");
    }

    public Bike(){
        System.out.println("Bike object created");
    }

}
