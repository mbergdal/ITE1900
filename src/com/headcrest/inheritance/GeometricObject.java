package com.headcrest.inheritance;

public abstract class GeometricObject{
    private String color;
    double area; //could also have access modificator default (nothing) in this example private - <default> - protected - public

    public GeometricObject(){
        color = "black";
    }

    public GeometricObject(String color){
        this.color = color;
    }

    public double getArea(){
        return area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void calculateArea();

    @Override
    public String toString(){
        return "Geometric object";
    }
}
