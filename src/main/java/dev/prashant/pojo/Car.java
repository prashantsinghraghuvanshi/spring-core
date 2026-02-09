package dev.prashant.pojo;

public class Car {
    Engine engine;

    // constructor injection
    public Car(Engine engine){
        System.out.println("Car Object created");
        this.engine=engine;
        System.out.println("Engine initialized in car");
    }

    public void start(){
        engine.start();
        System.out.println("Car is running");
    }
}
