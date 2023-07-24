package com.company;

import java.util.Scanner;

public class MethodOverloadingInJava {

    //methods

    static void change(int a){
        a=98;
    }

    static void change2(int [] a){
        a[0]=52;
    }
    static void telljoke(){
        System.out.println("hello\n"+"morning");
    }

   //Method Overloading In java
    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void foo(int a, int b, int c){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
        System.out.println("Good morning " +c + " bro!");
    }

    //more example on method overloading
    static int multiply(int a,int b){

        return a*b;
    }
    static double multiply(double a,double b){
        return  a*b;
    }

    //Some more example
   static int multiply1(int a,int b){
        return a*b;
    }
    static int multiply1(int a,int b,int c){
        return  a*b*c;
    }



    //Main methods
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       // telljoke();   //this function returns nothing.
        int [] marks={90,91,82,94,87};

       //case-1 changing an integer
     /*   int x=45;
        change(x);
        System.out.println("value of a changes to: "+x);
         //here value doesn't change */

        //case-2 changing array element
       change2(marks);
        System.out.println("value of marks[0] change to: "+marks[0]);
        //here value  change-IN CASE OF ARRAYS, THE REFERENCE IS PASSED.SAME IS THE CASE FOR OBJECT PASSING TO METHOD */

        //Method overloading
        //calling methods with same name but with different work
        foo();    //<--it is different from other foo() methods
        foo(5);   //<---Similarly for this
        foo(6,9);   //<---Similarly for this
        foo(79,98,64);  //<---Similarly for this

        /*while calling a method we give arguments
            Arguments are Actual!
            value which take place in method are parameters
            */

        //more example on method overloading
        int c = multiply(5,4);
        double d = multiply(5.1,4.2);
        System.out.println("Mutiply method : returns integer : " + c);
        System.out.println("Mutiply method : returns double : " +  d);

        //some more example
        int y = multiply1(5,4);
        int z = multiply1(5,4,3);
        System.out.println(y);
        System.out.println(z);

    }
}
