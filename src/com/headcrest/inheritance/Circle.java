package com.headcrest.inheritance;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }
}
