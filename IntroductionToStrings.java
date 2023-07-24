package com.company;
import  java.util.Scanner;
public class IntroductionToStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String("ujjwal");
        System.out.println(str);
        String ste1 = "ujjwal";
        System.out.println(ste1);

        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %f", a, b);  //output- The value of a is 6 and value of b is 5.6454
        //System.out.format("The value of a is %d and value of b is %f", a, b);
        System.out.printf("the value of a is %d and value of b is %7.2f",a,b);
        //In above code b take 7 character space and only give 2 decimal after point

        /*
In printf(); statements-:
     %d for int
  %f for float
  %c for char
  %s for string
*/

        //we can input string from user
        System.out.println("enter your string: ");
        String str1=sc.nextLine();
        System.out.println("your string is: "+str1);



    }
}


//String is a sequence of character it is a class but can be used as a datatype.  Strings are immutable and cannot be changed.
/*we can make a string by 2 methods-:
   (i-)    String name="Here is your string";

    (ii-)  String name=new String("here is your string");
                    */

/*Different ways to print in Java :
    System.out.print() // No newline at the end
    System.out.println() // Prints a new line at the end
    System.out.printf()
    System.out.format()   it is same as printf() statements.
    System.out.printf("%c",ch)  
*/


