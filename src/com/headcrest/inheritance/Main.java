package com.headcrest.inheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricObject> geometricObjects = new ArrayList<>();

        GeometricObject circle = new Circle(2.0);
        GeometricObject square = new Square(2.0, 2.0);

        geometricObjects.add(circle);
        geometricObjects.add(square);

        for (GeometricObject obj: geometricObjects)
        {
            obj.calculateArea();
            System.out.println(obj.getArea());
        }
    }
}
