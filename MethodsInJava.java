package com.company;

import java.util.Scanner;

public class MethodsInJava {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
        x = 566;
        return z;
    }

    static float divides(float firstNum,float secondNum){
        float thirdNum;
        if (secondNum == 0) {
            System.out.println("cannot divide by zero");
            thirdNum=0;
        }
        else {
            thirdNum = firstNum / secondNum;
        }
        return thirdNum;}

    int sum(int A,int B){
        int C=A+B;
        return C;
    }

        /*Sometimes our program grows in size, and we want to separate the logic of the main method from the other methods.
For instance, if we calculate the average of a number pair 5 times, we can use methods to avoid repeating the logic*/

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = 5;
        int b = 7;
        int c;

 /*       // Method invocation using Object creation
        MethodsInJava obj = new MethodsInJava();
        c = obj.logic(a, b);
        */

        c = logic(a, b);   //cAlling the method name logic as we made this method above
        System.out.println(a + " "+ b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);

        System.out.println("______________________________________________________");
        System.out.println("example of second method");
        float p=sc.nextInt();
        float q=sc.nextInt();
        float r=divides(p,q);
        System.out.println(r);


        /*To run a method which doesn't have static keyword we have to make a object*/
        MethodsInJava obj=new MethodsInJava();
        int D=obj.sum(69,34);
        System.out.println(D);


    }
      }

      /*
//method is a function written inside a class.
*/

// Since Java is an object-oriented language, we need to write the method inside some class.

/*
Syntax of method-:
   static dataType name(){
    //method body
    }

example-:
   static int mySum(int a, int b) {
        int c = a+b;
        return c;	//Return value
    }
*/

/*
//eske liye static nhi lagana padega

A method can be called by creating an object of the class in which the method exists followed by the method call:
Calc obj = new Calc(); //Object Creation
obj.mySum(a ,b); //Method call upon an object
 */