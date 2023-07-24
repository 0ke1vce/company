package com.company;
import java.util.Scanner;
/*class Practice_Set_Custom extends Exception{
    public String toString(){
        return "error hai yeh";
    }
}*/

public class Practice_Set_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

   /*     //Question-1 Write a java program to demonstrate syntax, logical 2 runtime errors.
//        1-Syntax error
//        System.out.println(this is syntax error example);

//        2-Logical error
      /*  //write a program to print first 10 whole number
        for (int i=0;i<11;i++){   //this is a logical error it will print 11 whole number.
            System.out.println(i);
        }*/

//        3-Runtime error
      /*  int a=5;
        int b=sc.nextInt();  //if user enter anything other than a number it will be an exception
        int c=a+b;
        System.out.println(c);*/


/*
//Question-2 Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.
        try {
            int a=79/0;
        }
        catch (ArithmeticException e){
            System.out.println("HaHa");
        }
        catch (IllegalArgumentException d){
            System.out.println("HeHe");
        }
        */



     /*
        //Question-3 Write a program that allows you an array until a valid index is given. If max retries exceed 5 print "errors".
        int []a={45,32,21,232,32};
        int x=1;
        while (x<=5){
            System.out.println("enter index to access ");
            int y=sc.nextInt();
            try {
                System.out.println(a[y]);
                break;
            }
            catch (Exception e){
                System.out.println(" ");
            }
            x++;
        }
        if (x>5) {
            System.out.println("error");
        }
        */

/*
//Question-4  Modify program in Q3 to throw a custom Exception if max retries are reached
        int []a={45,32,21,232,32};
        int x=1;
        while (x<=5){
            System.out.println("enter index to access ");
            int y=sc.nextInt();
            try {
                System.out.println(a[y]);
                break;
            }
            catch (Exception e){
                System.out.println(" ");
            }
            x++;
        }
        if (x>5) {
            try {
                throw new Practice_Set_Custom();
            }
            catch (Exception e){
                System.out.println(e.toString());
            }

        }*/

        }
    }

