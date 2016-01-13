package com.headcrest.car;

public class Car {
    //Private members
    private Engine engine;
    private Driver driver;

    //Constructors
    public Car() {
        engine = new Engine();
    }

    public Car(Driver driver){
        this();
        this.driver = driver;
    }

    //Methods
    public void drive() {
        if (this.driver != null) {
            engine.start();
        }
    }

    //Setter for this.driver
    public boolean isStarted() {
        return engine.isStarted();
    }

    //Getter for this.driver
    public Driver getDriver(){
        return driver;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }
}
