package com.company;

public class Loops {
  /*
    public static void main(String[] args) {
        ascendNum();
        descendNum();
        evenNum();
        oddNum();
        skipNum();
    }
        public static void ascendNum()
        {
            System.out.println("Numbers from 1 to 100:");
           for (int i=1 ; i<=100 ;i++)
           {
               System.out.println(i);
           }
        }


        public static void descendNum()
        {
            System.out.println("Numbers from 100 to 1:");
            for (int i=100 ; i>=1 ;i--)
            {
                System.out.println(i);
            }
        }

        public static void evenNum()
        {
            System.out.println("Even numbers from 1 to 100:");

            for (int i=1 ; i<=100 ;i++)
            {
                if(i%2==0) {
                    System.out.println(i);
                }
            }
        }

        public static void oddNum()
        {
            System.out.println("Odd numbers from 1 to 100:");
            for (int i=1 ; i<=100 ;i++)
            {
                if(i%2!=0) {
                    System.out.println(i);
                }
            }
        }

        public static void skipNum()
        {
            System.out.println("Alternate numbers from 1 to 100:");
            for (int i=1 ; i<=100 ;i=i+2)
            {
                System.out.println(i);
            }
        }

}
*/

/*
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 10; i++) {

            sum = sum + i;
        }
        System.out.println(sum);
    }
}
 *****/


    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }

        int j=0;
        while (j <= 10 ){
            System.out.println(j);
            j++;
        }


        int k=1;
        do{
            System.out.println(k);
            k++;
        }
        while(k<=10);


        while (true)
        {
            System.out.println("hello");
        }



    }

}
