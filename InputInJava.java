package com.company;
import java.util.Scanner;   //yeh scanner class ko import karta h
public class InputInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number 1");
        int a=sc.nextInt();
        System.out.println(a);
//
//        System.out.println("enter number 2");
//        int b=sc.nextInt(); //nextInt() is use to take integer as output.

//        if we want a float number as input
        System.out.println("enter float");
        float c=sc.nextFloat();
        System.out.println(c);

//        if we want word as input
        System.out.println("enter string");
        String str=sc.next(); //next method only read a word from inputted string
        System.out.println(str);

        System.out.println("It works");
//        System.out.println("number 1 is,"+a+",number 2 is,"+b);

//        to check if a number input is int
        System.out.println("input from user");
        boolean b1=sc.hasNextInt();  //for checking for string we can use sc.hasNext() for float we can use hasNextFloat() etc..
        System.out.println(b1);

//        to input a string from user
        System.out.println("enter string to check");
        String str1=sc.nextLine();
        System.out.println(str1);
    }
}


// Getting User Input in Java-
//  Reading data from the Keyboard :
//        Scanner class of java.util package is used to take input from the user's keyboard.The Scanner class has many methods for taking input from the user depending upon the type of input. To use any of the methods of the Scanner class, first, we need to create an object of the Scanner class.
//  Example-:
//        import java.util.Scanner;  // Importing  the Scanner class
//        Scanner sc = new Scanner(System.in);  //Creating an object named "sc" of the Scanner class.

//   Taking an integer input from the keyboard :
//        Scanner S = new Scanner(System.in);  //(Read from the keyboard)
//        int a = S.nextInt();  //(Method to read from the keyboard)       Here imputed integer from keyboard store in the variable name a.

//to have a word as input we can do as following
//String x=sc.next();  it can only read a word from input

//to read whole string from input we can use-:
//String x=sc.nextLine();