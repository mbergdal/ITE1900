package com.headcrest.inheritance;

public class Square extends GeometricObject {
    private double heigth;
    private double length;

    public Square(double heigth, double length) {
        super();
        this.heigth = heigth;
        this.length = length;
    }

    @Override
    public void calculateArea(){
        area = heigth * length;
    }

    @Override //Override
    public String toString(){
        return getColor() + " square";
    }

    //Overload
    public String toString(String prefix){
        return prefix + " " + this.toString();
    }
}
