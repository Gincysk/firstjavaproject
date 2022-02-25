package com.company;

import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args) {
        System.out.println("Please enter the first number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Please enter the second number:");
        int num2 = sc.nextInt();

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println(" The numbers when swapped are :" +num1 + "," +num2 );
    }
}
