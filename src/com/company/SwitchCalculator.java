package com.company;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        float result=0;
        System.out.println("Please enter the first number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please enter the second number:");
        int b = sc.nextInt();
        System.out.println("Please select the type of operation- " + "\n" + "+" + "\n" + "-" + "\n" + "*" + "\n" + "/");
        char c = sc.next().charAt(0);


        switch (c) {
            case '+':
                result = a + b;
                break;

            case ('-'):
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                result = a / b;
                break;

            default:
                System.out.println("Invalid operation");
                break;
        }
        System.out.println("The result is: " +result);

    }
}
