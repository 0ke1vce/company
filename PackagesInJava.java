package com.company;

//import  java.util.Scanner;  //import scanner class from this  packages.
//import  java.util.*;  //import every class from java.util package


public class PackagesInJava {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);  //using Scanner class without importing
        int a=sc.nextInt();
        System.out.println("this is my scanner "+a);
    }


}
