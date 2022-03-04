package com.company;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

//        String name = "gincy";
//        char[] chars = name.toCharArray();
//
//
//        char[] reverseArray = new char[name.length()];
//
//        int length = chars.length;
//        int lastIndex = length-1;
//        for(int i=0;i<= lastIndex;i++)
//        {
//        reverseArray[lastIndex-i]=chars[i];
//        }
//        String reversed = new String(reverseArray);
//        System.out.println(reverseArray);
//        System.out.println(reversed);
//
//        if (reverseArray.equals(name)) {
//            System.out.println("It is palindrome");
//        }
//        else {
//            System.out.println("It is not palindrome");
//        }


        //swapping 2 characters in a string

        System.out.println("Enter the value of the string:");
        System.out.println("Testing");
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        System.out.println("Enter the value of i:");
        int i = sc.nextInt();
        System.out.println("Enter the value of j:");
        int j = sc.nextInt();
        swapChar(s,i,j);
        }
        public static void swapChar(String s, int i, int j)
        {
            char[] chars = s.toCharArray();
            char temp = chars[j];
            chars[j] = chars[i];
            chars[i] = temp;

            String swappedString = new String(chars);
            System.out.println("The string when swapped is:" +swappedString);
        }
    }
