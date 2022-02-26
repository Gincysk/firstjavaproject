package com.company;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        //To print sum of marks in array
//        float marks[] = new float[]{3,4,6,5,8};
//
//
//                    float sum=0;
//                    for(int i=0;i<5;i++) {
//                        sum = sum + marks[i];
//                    }
//        System.out.println("The sum of marks is :"+sum);


//        float marks[]=new float[10];
//        System.out.println("Please enter the 10 numbers you wish to add:");
//        Scanner sc = new Scanner(System.in);
//
//        for (int i=0;i<10;i++)
//        {
//            marks[i]=sc.nextFloat();
//        }
//
//        float sum=0;
//        for(int i=0;i<10;i++)
//        {
//            sum = sum+marks[i];
//        }
//        System.out.println("The sum of the numbers is:" +sum);



        //To print first name using char array
//        char name[] = new char[]{'G','i','n','c','y'};
//
//                    for(int i=0;i<5;i++) {
//                        System.out.print(name[i]);
//                    }



    // To print average of a column in array
//        int arr[][] = new int[][]{
//            {3, 6, 3},
//            {5, 7, 5},
//            {2, 9, 5},
//            {1, 7, 4},
//            {7, 3, 3}
//        };
//
//        for (int i = 0; i < 3; i++) {
//            float sum = 0;
//            for ( int j = 0; j < 5; j++) {
//                sum = sum + arr[j][i];
//
//            }
//            float average = sum/arr.length;
//            System.out.println("Average of column " +(i+1) + " is:  " + average);
//        }





        //To print boundaries of array

        int arr[][] = new int[][]{
                {3, 6, 3, 6},
                {5, 7, 1, 7},
                {2, 9, 5, 2},
                {1, 7, 4, 1},
        };

        System.out.println("The original 2D array is:");
        for (int i = 0; i < 4; i++)
        {
            for ( int j = 0; j < 4; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("The array boundary is:");
        for (int i = 0; i < 4 ; i++)
        {
            for ( int j = 0; j < 4 ; j++) {

                if (i == 0 || j == 0 || i == arr.length -1 || j == arr.length -1)
                {
                    System.out.print(arr[i][j] +" ");
                }
                else
                {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }

    }
}