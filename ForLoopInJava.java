package com.company;
import java.util.Scanner;

public class ForLoopInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=10;i+=1){   //for (initialisation;condition;increment/decrement)
            System.out.println(i);
        }

        //Write a program to print first n odd number using for loop.
       /* for (int i=1;true;i++){
            if (i%2!=0) {
                System.out.println(i);
            }
        }*/

//        Decrementing for loop
    for (int i=7;i>0;i--){
        System.out.println(i);
    }

    //WAP to print frist n natural number in reverse order
        int n=sc.nextInt();
        for (int i=n;i>0;i--){
            System.out.println(i);
        }



    }
}

//    For loop in java is used to iterate a block of code multiple times
//Use for loop only when the exact number of iterations needed is already known to you.
//        Syntax-for (initialize; check_bool_expression; update){
                               //code;                }

// 2i = Even Numbers = 0, 2, 4, 6, 8
// 2i+1 = Odd Numbers = 1, 3, 5, 7, 9