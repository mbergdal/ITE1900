package com.headcrest.inheritance;

public class Equals {
    public static void main(String[] args) {
        Circle s1 = new Circle(1.0);
        Circle s2 = new Circle(1.0);

        if (s1.equals(s2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
