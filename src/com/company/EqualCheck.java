package com.company;

import java.util.Scanner;

public class EqualCheck {
    public static void main(String[] args) {
        System.out.println(" Please enter the first number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(" Please enter the second number");
        //  Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.println(" Please enter the third number");
        // Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        checkInputs(x, y, z);
    }

        public static void checkInputs(int x, int y, int z){
            if (x==y && y==z)
            {
                System.out.println("The 3 numbers are equal");
            }
            else{
                System.out.println("The 3 numbers are not equal");
            }
        }

}

