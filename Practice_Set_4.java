package com.company;

import java.util.Scanner;

public class Practice_Set_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /*Question :Write a program to find out the type of website from the URL:
                        .com – commercial website
                        .org – organization website
                        .in – Indian website
        System.out.println("enter name of your website: ");
        String str=sc.nextLine();
        if (str.endsWith(".com")){
            System.out.println("its a commercial website");
        }
        else if (str.endsWith(".org")) {
            System.out.println("its a organization website");
        }
        else if (str.endsWith(".in")) {
            System.out.println("its an indian website");
        }
        else {
            System.out.println("we don't have info about this website");
        }*/

   //  Question : Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]
  /*       System.out.println("please enter a number form 1 to 7");
        byte ch=sc.nextByte();
        if (ch==1){
            System.out.println("monday");
        }
        else if (ch==2){
            System.out.println("monday");
        }
        else if (ch==3){
            System.out.println("monday");
        }
        else if (ch==4){
            System.out.println("monday");
        }
        else if (ch==5){
            System.out.println("monday");
        }
        else if (ch==6){
            System.out.println("monday");
        }
        else if (ch==7){
            System.out.println("monday");
        }
        else {
            System.out.println("enter a valid number from 1to 7");
        }*/
        //or
     /*   int day = sc.nextInt();
     switch (day){
           case 1 -> System.out.println("Monday");
          case 2 -> System.out.println("Tuesday");
           case 3 -> System.out.println("Wednesday");
           case 4 -> System.out.println("Thursday");
           case 5 -> System.out.println("Friday");
          case 6 -> System.out.println("Saturday");
          case 7 -> System.out.println("Sunday");
       }*/

/*        Question  : What will be the output of this program:
        int a = 10;
        if (a=11)
            System.out.println(“I am 11”);
        else
            System.out.println(“I am not 11”);

   Output is Error.
            */

/* Question-   Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33 Marks in each subject to pass.
// Assume 3 subjects and take marks as input from the user?
        System.out.print("Enter your marks of first subject out of 100: ");
        float sub1=sc.nextInt();
        System.out.print("Enter marks of second subject out of 100: ");
        float sub2=sc.nextInt();
        System.out.print("Enter marks of third subject out of 100: ");
        float sub3= sc.nextInt();

        float Total_percentage=(sub1+sub2+sub3)/3;
        System.out.println(Total_percentage+"% was scored by the student");
        if (Total_percentage>=40 && sub1>=33 && sub3>=33 && sub2>=33){
            System.out.println("Student is pass");
        }
        else {
            System.out.println("Student failed the exam");
        }*/

       /* Question  :Calculate income tax paid by an employee to the government as per the slabs mentioned below:
        Income Slab 	Tax
        2.5L – 5.0L   	5%
        5.0L – 10.0L  	20%
        Above 10.0L 	30%
        Note that there is not tax below 2.5L. Take the input amount as input from the user.
        System.out.println("Please enter your principle amount in Lakh: ");
        float principle=sc.nextFloat();
        System.out.println("Principle amount is "+principle+"Lakh");
        if (principle<2.5){
            System.out.println("No tax should be payed");
        }
        else if (principle>=2.5 && principle<5.0) {
            System.out.print("your rate is 5% Hence your Income tax per year will be: ");
            System.out.println(1000*principle*5+"Rupees");
                    }
        else if (principle>=5.0 && principle<10.0) {
            System.out.print("your rate is 20% Hence your Income tax per year will be: ");
            System.out.println(1000*principle*20+"Rupees");
                    }
        else if (principle>=10) {
            System.out.print("your rate is 30% Hence your Income tax per year will be: ");
            System.out.println(1000*principle*30+"Rupees");
                    }
        else if (principle<0){
            System.out.print("There is no negative amount");
        }*/


    }
}
