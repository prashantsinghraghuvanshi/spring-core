package dev.prashant.pojo;

import dev.prashant.VehicleService.Vehicle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle {
    
    @Value(value = "petrol")
    private String fueltype;

    @Override
    public void start() {
        System.out.println("Bike Started");
        System.out.println("Fuel Type : "+fueltype);
    }

    public Bike(){
        System.out.println("Bike object created");
    }

}
