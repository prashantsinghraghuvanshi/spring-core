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

    private String name;

    @Override
    public void start() {
        System.out.println("Bike Started");
    }

    public Bike(@Value(value = "RE Hunter") String name){
        this.name=name;
        System.out.println("Bike object created");
    }

    @Override
    public void details() {
        System.out.println("Bike name : "+name);
        System.out.println("Fuel Type : "+fueltype);
    }
}
