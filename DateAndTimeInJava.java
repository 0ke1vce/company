package com.company;

public class DateAndTimeInJava {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        System.out.print("Number of second passed is: "+System.currentTimeMillis()/1000);
        System.out.println(" ");
        System.out.print("Number of hours passed is: "+System.currentTimeMillis()/1000/3600);
        System.out.println(" ");
        System.out.print("Number of day passed is: "+System.currentTimeMillis()/1000/3600/24);
        System.out.println(" ");
        System.out.print("Number of year passed is: "+System.currentTimeMillis()/1000/3600/24/365);
        System.out.println("_________________________");
        System.out.println("The maximum value of long is :" + Long.MAX_VALUE);
        System.out.println("The value of current time in ms : " + System.currentTimeMillis());
    }
}


/*
java time -> package for date & time in java from java onwards
Before java 8, java util package used to hold the date time class now these classes are deprecated
 */


/*
Date in java is stored in the form of a long numer.
 This long number holds the number of milliseconds passed since 1 jan 1970

Java assumes that 1900 is the start year which means it calculates years passed since 1900.
Whenever We ask it for years passed .

System.current.TimeMillis() returns no of sound passed Once no. of ms are calculated.
We can calculate minutes, seconds & years passed.
 */