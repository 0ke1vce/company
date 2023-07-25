package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Scanner;

public class Practice_Set_Advance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //Question 1: Create an ArrayList and store the names of ten students inside it.
        // Print it using a for each loop.
  /*      ArrayList <Integer>l1=new ArrayList<>();
        for (int i=0;i<10;i++){
            System.out.print("number to add: ");
            int new_num_to_add=sc.nextInt();
            l1.add(new_num_to_add);
        }
        for (int element:l1) {
            System.out.print(element+" ");
        }
*/

        //Question 2: Use the Date class in Java to print the time in the following format : 21:47:02.
    /*    LocalDateTime d=LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(d.format(df));
*/


        //Question 3: Create a Set in java. Try to store the duplicate values elements inside this set
        // verify that only one instance is stored.
     /*   HashSet <Integer> hs=new HashSet<>();
        hs.add(5);
        hs.add(12);
        hs.add(432);
        hs.add(22);
        hs.add(5);
        hs.add(32);
        hs.add(23);
        for (int element:
             hs) {
            System.out.println(element);
        }*/

//Question 3: Repeat question number 2 using the Calendar class.
        Calendar c1=Calendar.getInstance();
        System.out.println(c1.get(Calendar.HOUR)+":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));



    }
}
