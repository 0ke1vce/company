package com.company;

import java.util.Scanner;
public class AssociativityInJava {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
/*qs-1 how will you write (x-y)/2 in java
        float x=sc.nextInt();
        float y=sc.nextInt();
        float z=(x-y)/2;
    System.out.println(z);*/

/*qs-2 how will you write (b**2-4a*c)/2*a in java
        float b=sc.nextInt();
        float a=sc.nextInt();
        float c=sc.nextInt();
        float z= ((b*b)-(4*a*c))/2*a;
        System.out.println(z);*/

/*  qs-3 how will you write v**2-u**2 in java
     float v=sc.nextInt();
     float u=sc.nextInt();
     float z=v*v-u*u;
    System.out.println(z);*/

/*   qs-4 how will you write a*b-d in java
        float a=sc.nextInt();
        float b=sc.nextInt();
        float d=sc.nextInt();
        float z=a*b-d;
    System.out.println(z);*/
}
}

//        Associativity tells the direction of the execution of operators. It can either be left to right or vice versa.

    /*
Precedence of Operator->
operators are applied and evaluated based on precedence. For example, (+, -) has less precedence compared to (*, /). Hence * and / are evaluated first.
       In case we like to change this order, we use parenthesis ().*/