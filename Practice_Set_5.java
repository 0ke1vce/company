package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_Set_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /* Question 1: Write a program to print the following pattern :
         ****
         ***
         **
         *             */
        //Very very important
        /*int n=4;
        for (int i=n;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }*/

//        Question 2: Write a program to sum first n even numbers using a while loop.
      /*  int sum=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            sum+=(2*i);
        }
        System.out.println("Sum of even number is: "+sum);*/

//        Question 3: Write a program to print the multiplication table of a given number n.
        /*System.out.println("Enter number to find the table");
        int n=sc.nextInt();
        int i=1;
        while (i<=10){
            System.out.println(n+"X"+i+"="+n*i);
            i++;
        }*/

//        Question 4: Write a program to print a multiplication table of 10 in reverse order.
     /*   int n=10;
        for (int i=n;i>0;i--){
            System.out.println(n+"X"+i+"="+n*i);
        }*/

//        Question 5: Write a program to find the factorial of a given number using for loops.
        /*int n=sc.nextInt();
        int i=1;
        int factorial=1;
        while (i<n){
            if (n==0){
                System.out.println("factorial of zero is 1");
            }
            else if (n<0) {
                System.out.println("factorial of negative number is not defined");
            }
            else {
                i++;
                factorial*=i;
            }
        }
        System.out.println("factorial of "+n+" is "+factorial);*/

//        Question 9: Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
  /*  int n=8;
    int sum=0;
    int i=1;
    while (i<=10){
        System.out.println(n+"X"+i+"="+n*i);
        sum=sum+(n*i);
        i++;
    }
        System.out.println("sum is: "+sum);
*/
    }
}
