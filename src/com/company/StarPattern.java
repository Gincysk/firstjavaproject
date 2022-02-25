package com.company;

public class StarPattern {
    public static void main(String[] args) {
        //increasing star pattern
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Decreasing star pattern
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
