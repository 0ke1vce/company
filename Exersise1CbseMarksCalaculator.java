package com.company;
//Write a program to calculate the percentage of a given student in the CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)
import java.util.Scanner;
public class Exersise1CbseMarksCalaculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of first subject out of 100");
        byte sub1=sc.nextByte();
        System.out.println("Enter marks of second subject out of 100");
        byte sub2=sc.nextByte();
        System.out.println("Enter marks of third subject out of 100");
        byte sub3=sc.nextByte();
        System.out.println("Enter marks of fourth subject out of 100");
        byte sub4=sc.nextByte();
        System.out.println("Enter marks of fifth subject out of 100");
        byte sub5=sc.nextByte();
        float percentage= (float) (sub1 + sub2 + sub3 + sub4 + sub5) /5 ;
        System.out.println("total percentage of the student is: "+percentage);
    }
}
