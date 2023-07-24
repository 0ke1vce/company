package com.company;

import java.util.Scanner;

class MyExceptions extends Exception{
    public String toString(){
        return " I am toString()";
    }
    public String getMessage(){
        return      " I am getMessage()";
    }
}

/*class MaxAge extends Exception{
    public String toString(){
        return " Age cannot be greater than 125";
    }
    public String getMessage(){
        return      "Make sure value of age is correct";
    }
}*/

public class ExceptionClassInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        if(a<99){
            try {
                throw new MyExceptions();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);   //here toString() will run
                e.printStackTrace();  //it is not an error
                System.out.println("Finished Exception block");
            }
            System.out.println("Finished whole code!");
}
    }
}


/*
The Exception class in Java
We can write our custom Exceptions using the Exception class in java.

public class MyException extends Exception {
       // Overridden methods
}


The Exception class has the following important methods:
1) Strings toString() executed when System.out.println(e) is run
2) Void printStackTrace() - prints Stack trace
3) String getMessage() - prints the exception message
 */