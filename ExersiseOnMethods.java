package com.company;

import java.util.Random;
import java.util.Scanner;


public class ExersiseOnMethods {

  /*   static float average(int x,int y,int z){
        float avg= (float) (x + y + z) /3;
        return avg;
    }*/


    /*static int sumFrom1TonOfOdd(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
                if (i%2!=0){
                    sum+=i;
                }
            }
        return sum;
    }*/

   /* static int greaterNumber(int x,int y){
        if (x>y){
            System.out.println(x+" is greater than "+y);
            return x;
        }
        else if(x<y){
            System.out.println(y+" is greater than "+x);
            return y;
        }
        else {
            System.out.println("Both are equal");
            return x;
        }
    }
*/

   /*  static double circumference(){
         Scanner s=new Scanner(System.in);
        System.out.print("enter radius of the circle: ");
        int radius=s.nextInt();
        double circumferenceCircle=Math.PI*2*radius;
        return circumferenceCircle;
    }
    */


  /*  static  String eligible(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte age=s.nextByte();
        if (age>0 && age <18){
            return ("you are not eligible for vote");
        }
        else if (age<100 && age>18 ){
            return "you are eligible for vote";
        }
        else {
            return "enter a valid age";
        }
    }
*/

  /*static   void infiniteLoopDoWhile(){
        int i=0;
        do {
            System.out.println("loop number "+i);
            i++;
        }while (true);
    }
    */

    /*
static void enterNumberTillUserWant(){
    Scanner s=new Scanner(System.in);
    int no_of_positive=0;
    int no_of_negative=0;
    int no_of_zeroes=0;
    while (true){
        System.out.println("what do you want to do\n1- enter number\n2-Exit");
        int a=s.nextInt();
        if (a==1){
            System.out.println("continuing this ");
            while (true){
                System.out.println("enter your number: ");
                int b=s.nextInt();
                if (b>0){
                    no_of_positive+=1;
                }
                else if(b<0){
                    no_of_negative+=1;
                }
                else {
                    no_of_zeroes+=1;
                }
            break;
            }
        }
        else if(a==2){
            System.out.println("exxiting the loop");
            break;
        }
        else {
            System.out.println("Enter a valid number");
        }
    }

    System.out.println("number of positive number is: "+no_of_positive);
    System.out.println("number of negative number is: "+no_of_negative);
    System.out.println("number of zeroes is: "+no_of_zeroes);
}*/


   /* static long xToPowern(int x,int y){
        long z= (long) Math.pow(x,y);
        return z;
    }*/

  /*  static  void fibbonacciSeries(int n){
        int n1=0,n2=1,n3,i,count=n;
        System.out.print(n1+" "+n2);
        for ( i=2;i<count;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }*/


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Enter 3 number from user and make a function to print thier average.
      /*
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        System.out.print("Enter third number: ");
        int c=sc.nextInt();
        System.out.println("Average of the three number is: "+average(a,b,c));
        */

        //Write a method to print sum of all odd number from 1 to n (n is number entered by user).
     /*   System.out.print("Sum of all odd number between  1 to ");
        int n=sc.nextInt();
        System.out.println("Sum of all odd number between 1 to "+n+" is: "+sumFrom1TonOfOdd(n));
        */

        //Write a function which take two number and returns greater of those two.
     /*   System.out.print("enter first number: ");
        int a= sc.nextInt();
        System.out.print("Enter second number: ");
        int b= sc.nextInt();
        System.out.println("Greater number between "+a+" and "+b+" is "+greaterNumber(a,b));
        */


        //write a function that take radius as input and returns circumfarence of the circle.
     /*   System.out.println("circumfarence of the circle is: "+circumference());
*/

        //write a function that take age as input and return if user is eligible for vote.
      /*  System.out.println(eligible()); */


//       Write an infinte loop using do-while loop.
     /*   infiniteLoopDoWhile();  */

        //Write a function  to enter the number till user wants it and at the end display count of positive,negative and zeroes entered.
 /*       enterNumberTillUserWant();    */

        //two number are entered by user x and n find value of x to the power n.
  /*      System.out.println(xToPowern(2,6));  */

        //fibbonci series using java
    /*    System.out.println("fibonaci series of first 10 number is:");
        fibbonacciSeries(10);
     */



    }
}
