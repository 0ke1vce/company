package com.company;

import java.util.Scanner;

public class RecursionInJava {
    //factorial(n)=n*(n-1)*(n-2)*........*3*2*1
//        factorial(5)=5*4*3*2*1=120
    //factorial(n)=n*factorial(n-1)  for all n>=1
//factorial(0)=1  //factorial(1)=1

    static  int factorial_recursive(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n*factorial_recursive(n-1);
        }
    }

    static int factorial_iterative(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            int product=1;
            for(int i=1;i<=n;i++){
                    product*=i;
            }
            return product;
        }
    }

//    QUIZ- print fibbonaci series
    static   void fibbonaci(int n){
        int n1=0,n2=1,n3,i,count=n;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i){
//loop starts from 2 because 0 and 1 are already printed
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       /*find factorial of a number using recursion */
        System.out.println("The value of 5 factorial using recursion is: "+factorial_recursive(5));
        /*find factorial of a number using iterative*/
        System.out.println("The value of 5 factorial using iteration is: "+factorial_iterative(5));

  //QUIZ- print fibbonaci series in java
        System.out.print("Number of terms in series: ");
        int x=sc.nextInt();
        fibbonaci(x);
    }
}
/*Function in java can call itself such calling of function
by itself is called recursion.*/