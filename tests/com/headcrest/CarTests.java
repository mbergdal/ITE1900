package com.headcrest;

import org.junit.Test;
import static org.junit.Assert.*;

public class CarTests {

    @Test
    public void drive_startsEngine(){
        Car car = new Car();
        car.drive();
        assertTrue(car.isStarted());
    }
}