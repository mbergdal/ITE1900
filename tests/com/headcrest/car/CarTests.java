package com.headcrest.car;

import org.junit.Test;
import static org.junit.Assert.*;

public class CarTests {

    @Test
    public void drive_noDriver_doesNotstartsEngine(){
        Car car = new Car();
        car.drive();
        assertFalse(car.isStarted());
    }

    @Test
    public void drive_withDriver_doesStartsEngine(){
        Car car = new Car(new Driver());
        car.drive();
        assertTrue(car.isStarted());
    }
}