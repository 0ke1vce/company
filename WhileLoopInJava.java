package com.company;
import java.util.Scanner;

public class WhileLoopInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //While Loop In JAVA->

        //Program to print from 1 to 10
        int incr=1;
        while (incr<=10){
            System.out.println(incr);
            incr+=1;
        }

//        Quiz- program to print number from 100 to 200
        int i=100;
        while (i<=200){
            System.out.println(i);
            i+=1;
        }
    }
}

/*The while loop in Java is used when we need to execute a block of code again and again based on a given boolean condition.
Use a while loop if the exact number of iterations is not known.
If the condition never becomes false, the while loop keeps getting executed. Such a loop is known as an infinite loop.
*/