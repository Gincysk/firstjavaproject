package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ArrayUtil {

    public static void main(String[] args) {

        int arr[] = new int[]{4, 7, 2, 1};
        System.out.println("Enter a number from the array");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        indexOf(a, arr);
        System.out.println("Enter the position of the number");
        int b = sc.nextInt();
        integerAt(b, arr);
        System.out.println("Enter the number you are looking for");
        int c = sc.nextInt();
        boolean value = containsInt(c, arr);
        System.out.println("The returned value is " +value);
        length(arr);

    }

    public static void indexOf(int a, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                System.out.println("The index of " + a + " is " + i);
            }
        }
        }


    public static void integerAt(int b, int arr[])
    {
        System.out.println("The number at position " + b + " is " + arr[b]);
    }

    public static boolean containsInt(int c, int arr[])
    {
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] == c)
            {
                return true;
            }
        }
        return false;
    }

    public static void length(int arr[])
    {
        int num =0;
        for(int k : arr)
        {
            num++;
        }
        System.out.println("The length of the array is : " +num);
    }
}





