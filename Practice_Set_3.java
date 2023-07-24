package com.company;

import java.util.Scanner;

public class Practice_Set_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
/*      Qs-1 WAP to convert a string to lowercase
        System.out.println("enter your string: ");
        String str=sc.nextLine();
        String lstr=str.toLowerCase();
        System.out.println("orignal string is: "+str+" and lowercased string is: "+lstr);*/

        /*Qs-2 WAP to replace spaces with underscore
        System.out.println("Enter your string: ");
        String str=sc.nextLine();
        String repstr=str.replace(" ","_");
        System.out.println("replaced string is: "+repstr);*/

        /*Qs-3    Write a Java program to fill in a letter template which looks like below:
        //          letter = “Dear <|name|>, Thanks a lot”
        //          Replace <|name|> with a string (some name)
        String str="Dear <|name|> ,Thanks a lot";
        System.out.println("this is my template-->");
        System.out.println(str);
        System.out.println("please enter your name: ");
        String Customstr=sc.nextLine();
        System.out.println(str.replace("<|name>|",Customstr));*/

        /*Qs-4 Write a Java program to detect double and triple spaces in a string.
        System.out.println("enter your string");
        String str=sc.nextLine();
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));*/

/*        Qs-5     Write a program to format the following letter using escape sequence characters.
//            Letter = “Dear Harry, This Java Course is nice. Thanks”
        System.out.println("Dear Harry\nThis Java Course is nice.\nThanks");*/
    }
}
