package com.headcrest.methods;

public class WhyMetods {
    public static void main(String[] args) {
        int sum1 = 0;
        for (int i = 1; i < 10; i++) {
            sum1 += i;
        }
        System.out.println(sum1);

        int sum2 = 0;
        for (int i = 20; i < 45; i++) {
            sum2 += i;
        }
        System.out.println(sum2);

        int sum3 = 0;
        for (int i = 30; i < 99; i++) {
            sum3 += i;
        }
        System.out.println(sum3);

//        System.out.println(sumNumbersFromTo(1,10));
//        System.out.println(sumNumbersFromTo(20,45));
//        System.out.println(sumNumbersFromTo(30,99));


        double random = Math.random();
        System.out.println(random);
    }

    private static int sumNumbersFromTo(int from, int to) {
        int sum = 0;
        for (int i = from; i < to ; i++) {
            sum += i;
        }

        return sum;
    }
}
