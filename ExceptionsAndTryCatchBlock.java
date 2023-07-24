package com.company;

public class ExceptionsAndTryCatchBlock {
    public static void main(String[] args) {
        /*
        1- Checked Exceptions - Compile time exceptions (Handeled By Compiler)
        2- UnChecked Exceptions - Runtime Exceptions.
         */

        int a=6000;
        int b=0;
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        }
        catch(Exception e) {
            System.out.print("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}


//exception is an event that occurs when a program is executed dissented the normal flow of instructions.
/*
    Commonly Occurring Exceptions
Following are few commonly occurring exceptions in java:

1) Null pointer exception

2) Arithmetic Exception

3) Array Index out of Bound exception

4) Illegal Argument Exception

5) Number Format Exception

 */

//TRY CATCH BLOCK
     /*   try {
               //Code
        catch(Exception e) {
             //code
                }
*/