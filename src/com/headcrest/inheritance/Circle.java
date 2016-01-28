package com.headcrest.inheritance;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius) {
        //super(); //This is not necessary, because of the way inheritance works
        super("red"); //But this is not
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    @Override
    //This method is redundant because of dynamic binding
    public String toString(){
        return super.toString();
    }

    @Override
    public boolean equals(Object c){
        if (c instanceof Circle){
            if (this.radius == ((Circle)c).radius){
                return true;
            }
        }

        return false;
    }
}
