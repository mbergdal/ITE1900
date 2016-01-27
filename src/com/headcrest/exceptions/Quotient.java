package com.headcrest.exceptions;

import java.util.Scanner;

public class Quotient {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Enter two integers: ");
            int int1 = input.nextInt();
            int int2 = input.nextInt();

            int quotient = int1 / int2;

            System.out.println(quotient);
        }
    }
}
