package com.company;
import java.util.Scanner;

public class DoWhileLoopInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//do while loop is an exit control loop
        /* // do-while loop executes first and then check for condition  it get executes at least 1 time.
        int a=1;
        do {
            System.out.println(a);
            a+=1;
        }while (a<=5);*/


     /*   //do while executes at least one also if condition is not true.
        int b=1;
        do {
            System.out.println(b);
            b+=1;
        }while (b>19);  //here condition is false */


        //Quick Quiz: Write a program to print first n natural numbers using a do-while loop.
        int first_num=1;
        do {
            System.out.println(first_num);
            first_num++;
        }while (true);


    }
}

/*Do- while loop is similar to a while loop except for the fact that it is guaranteed to execute at least once.
Use a do-while loop when the exact number of iterations is unknown, but you need to execute a code block at least once.
After executing a part of a program for once, the rest of the code gets executed on the basis of a given boolean condition. */


/*Syntax-:
        do {
        //code
        } while (condition); //note this semicolon  */