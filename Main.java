package com.company;
import java.util.*;
public class Main{
    public static void main(String[] args){  //main method is the entry point to our application
//        write code here
//        System.out.println("hello world!");
   Scanner sc=new Scanner(System.in);
   int number_of_element_in_array=sc.nextInt();
   int []arr=new int[number_of_element_in_array];
   for (int i=0;i<number_of_element_in_array;i++){
       arr[i]=sc.nextInt();
   }
        System.out.print("enter element to find: ");
   int ele=sc.nextInt();
   for(int j=0;j<arr.length;j++){
       if (arr[j]==ele){
           System.out.println("found in index: "+j);
       }
       else {
           System.out.println("Element not found");
       }
   }


    }

}


/*

Jdk=Jre+development tools
jre=Jvm+libraries

JDK=java development kit
JRE=java runtime environment
JVM=java virtual machine

*/

//Anatomy of java program-: 1-Documentation section i.e comments
//                            2- package statement--->optional
//                            3-import statemet--->optional
//                            4- interface  statememnt--->optional  5-Class statement--->optional
//                            5- Class defination --->optional
//6-                          6-main method class{ main methods}--> essential


//function are the code which can do specific task. e.g- plumber,electrician all can do specific task only

//classes are collection of similar function. e.g- household repair

//here ((void)) means function does not return any value

//here static make us possible to run this function without  making an object of this class.

//for classes we use pascal convention first letter of any word is upper case but for function we use camel case i.e first letter is capital.
//AddTwoNumber---> Pascal convention
//addTwoNumber---> Camelcase convention


