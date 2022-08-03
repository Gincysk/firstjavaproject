package com.company;

public class BasicCalculator {

    public static void main(String[] args)
    {

        System.out.println(sum(6,4));
        System.out.println(difference(7,3));
        System.out.println(multiply(3,7));
        System.out.println(divide(6,2));
    }


    public static int sum(int a, int b) {
        return a+b;
    }

    public static int difference(int a, int b) {
        return a-b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static int divide(int a, int b) {
        return a/b;
    }

}
