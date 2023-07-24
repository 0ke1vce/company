package com.company;

import java.util.Scanner;

public class RelationalAndLogicalOperatorInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = false;
//        if (a && b){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

        System.out.println("For Logical OR...");

//        if (a || b){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

        System.out.println("For Logical NOT");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);

    }
}

//    Relational operators are used to evaluate conditions (true or false) inside the if statements.
//Logical operators are used to provide logic to our Java programs.

//   && AND Operator :        Evaluates to true if both the conditions are true.
//   || OR Operator :        Evaluates to true when at least one of the conditions is true.
//    !  NOT Operator :        Negates the given logic (true becomes false and vice-versa)

//Logical And && > Logical Or || in precedance and they also solved from left to right