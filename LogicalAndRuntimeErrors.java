package com.company;

import java.util.Scanner;

public class LogicalAndRuntimeErrors {
    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
        // int a = 0 // Error: no semicolon!
        // b = 8; // Error: b not declared!


        //Logical error Demo
        /*
        Write a program to print prime number from 1 to 10
         */
        System.out.println("Number of prime number from 1 to 10");
        System.out.println(2);
        for (int i=1;i<5;i++){
            System.out.println(2*i+1);   //it's a logical error as it give also 9 as 9 is not a prime number.
            //it's a bug.
        }

        //Runtime Error-:
        //runtime error is caused by user
        float k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextFloat();
        System.out.println(" 1000 divided by k is "+ 1000/k);
        //here if we put k=0 then it gives an exception as divide by 0 is not possible.
        //or if we put k as any string it gives an exception
    }
}
