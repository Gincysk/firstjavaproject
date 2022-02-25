package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Please enter the number of elements in the Fibonacci series");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.print("" +a + "," + " " +b);
        for (int i=2;i<=count;i++)
        {
            c=a+b;
            System.out.print("," + " " +c);
            a=b;
            b=c;

        }


    }
}
