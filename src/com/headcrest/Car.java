package com.headcrest;

public class Car {
    private Engine engine;

    public Car(){
        engine = new Engine();
    }

    public void drive() {
        engine.start();
    }

    public boolean isStarted() {
        return engine.isStarted();
    }
}
