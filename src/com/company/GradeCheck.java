package com.company;

import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        System.out.println("Enter Maths marks");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter English marks");
        int b = sc.nextInt();
        System.out.println("Enter Science marks");
        int c = sc.nextInt();
        System.out.println("Enter Hindi marks");
        int d = sc.nextInt();
        System.out.println("Enter Geography marks");
        int e = sc.nextInt();
        calcPercentage(a,b,c,d,e);

    }
    public static void calcPercentage(int a, int b, int c, int d, int e){
        int sum= a+b+c+d+e;
        float percentage = (sum * 100)/500;
        System.out.println(" Your Total percentage is " +percentage +"%");
        if (percentage>80)
        {
            System.out.println("Grade A");
        }
            else if (percentage >=70 && percentage <80)
            {
                System.out.println(" Grade B");
            }
        else if (percentage >=60 && percentage <70)
        {
            System.out.println(" Grade B");
        }
        else
        {
            System.out.println(" Grade D");
        }
    }
}
