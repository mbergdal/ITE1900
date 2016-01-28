package com.headcrest.inheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricObject> geometricObjects = new ArrayList<>();

        GeometricObject circle = new Circle(2.0); // implicit casting  because Circle is-a GeometricObject (upcasting)
        GeometricObject square = new Square(2.0, 2.0);

        geometricObjects.add(circle);
        geometricObjects.add(square);

        for (GeometricObject obj : geometricObjects) {
            obj.calculateArea();
            System.out.println(obj.getArea());
        }

        System.out.println(circle.toString());
        System.out.println(square.toString());
        printWithPrefix("Awesome", square);
    }

    //Example of generic programming
    private static void printWithPrefix(String prefix, Object object) {
        if (object instanceof Square) {
            Square square = (Square)object;
            String stringWithPrefix = square.toString(prefix); //Must do a cast here. (downcasting) Explain why...
            System.out.println(stringWithPrefix);
        }
    }
}
