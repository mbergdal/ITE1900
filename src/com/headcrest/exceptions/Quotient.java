package com.headcrest.exceptions;

import java.util.Scanner;

public class Quotient {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Enter two integers: ");
            try {
                int int1 = input.nextInt();
                int int2 = input.nextInt();
                int quotient = findQuotient(int1, int2);
                System.out.println(quotient);
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }finally{
                System.out.println("Finally");
            }
        }
    }

    private static int findQuotient(int int1, int int2) throws IgnorantUserException {
        if (int2 == 0){
            throw new IgnorantUserException("Division by zero");
        }else{
            return int1 / int2;
        }
    }
}