package com.company;
import javax.swing.*;
import java.util.Scanner;

public class IfAndElseInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age=sc.nextInt();

        //        If-else ladder
       /* if (age>18){
            System.out.println("you can drive");
        }
        else{
            System.out.println("you can't drive");
        }*/

//        If-elif-else ladder
        if (age>18){
            System.out.println("you can drive");
        }
        else if (age==18) {
            System.out.println("driving test!");
        }
        else {
            System.out.println("you can't drive");
        }
        
    }
}

//In Java we can execute instruction on a condition be met.
/* Decision  making  instruction on java -: 1- If-else statement.
                                            2- Switch case statement.
 */

//Syntax of if -else statement
/* if (condition-to-be-checked) {
	statements-run -->if-condition-true;
}
else {
	statements- run --> if-condition-false;
}*/

//Some common relational operator-: >=,<=,<,>,==,!=