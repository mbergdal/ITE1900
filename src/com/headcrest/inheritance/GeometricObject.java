package com.headcrest.inheritance;

public abstract class GeometricObject {
    String color;
    double area;

    public GeometricObject(){
        color = "black";
    }

    public double getArea(){
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void calculateArea();
}
