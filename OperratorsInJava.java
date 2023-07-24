package com.company;

import java.util.Scanner;
public class OperratorsInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=4;
        int b=6%a;  //Here % is modulus operator it gives the remainder of 6/4  i.e- 2
        System.out.println(b);
    }
}


//Operator- They are use to perform operation on variable and values.

//types of operator -:
//1- arithmatic -> +,-,*,/,%,++,--
                     //Arithmatic operator cannot work on Boolean
                    //% operator can work on float and double.
//2- Assignment->  =,+=,-=,*=,/=
           //x+=1 implies x=x+1 ; x-=1 implies x=x-1  and so on....
//3- Comparision->  ==,>=,<=,!=
//4-logical->  &&,||,!
//5- Bitwise-> &,|

//logical operator-- These operators determine the logic in an expression containing two or more values or variables.
//e.g- 64>5 && 64>3   it gives as answer true.
//in and && statements if all condition are true then answer is true else False
//in or !! statements if any one statement is true then answer is true.