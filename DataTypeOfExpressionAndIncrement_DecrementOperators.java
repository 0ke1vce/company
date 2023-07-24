package com.company;
import java.util.Scanner;
public class DataTypeOfExpressionAndIncrement_DecrementOperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b); */

       /* // Increment and Decrement Operators
        int i = 56;
        // int b = i++; // first b is assigned i (56) then i is incremented

//        int j = 67;
//        int c = ++j; // first j is incremented then c is assigned j (68)

        System.out.println(i++);  //yeh 56 hi dega   kyui pehle yeh i show karega phir increment karega..
        System.out.println(i);  //yeh 57 dega kyuki i increment ho gya 1 se..
        System.out.println(++i);    //give 58   kyuki pehle increment ki uske baad print ki value i ki
        System.out.println(i);  //gives 58 as i which is 57 get increment by 1
        int y = 7;
        System.out.println( ++y *8);
        char ch = 'a';   character ko increment kiya hai yaha
        System.out.println(++ch);*/  //answer b ayega


  /*Quiz-Try increment and decrement operators on a Java variable
      1-  a++ -> first use the value and then increment
        2-        ++a -> first increment the value then use it*/

        /*int a=5;
         System.out.println(a++);   //Output- 5
        System.out.println(a);*/   //Output- 6

      /*  int a=5;
        System.out.println(++a);   //Output- 6
        System.out.println(a);*/   //Output-6
    }
}

/*
                        Resulting data type after arithmetic operation
Result = byte + short -> integer
Result = short + integer -> integer
Result = long + float -> float
Result = integer + float -> float
Result = character + integer -> integer
Result = character + short -> integer
Result = long + double -> double
Result = float + double -> double
*/

/*
                            Increment and Decrement operators
            a++, ++a (Increment Operators)
            a--, --a (Decrement Operators)
These will operate on all data types except Booleans.
*/