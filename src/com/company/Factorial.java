package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Please enter the number:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int factorial = 1;

        for(int i=1;i<=input;i++)
        {
            factorial = factorial * i;

        }
        System.out.println("Factorial of the given number is :" +factorial);
    }
}
