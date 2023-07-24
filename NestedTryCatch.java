package com.company;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter the value of index");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to video no 82");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program");


        //Write a java program that allows you to keep accessing an array until a valid index is givven by user:
        int [] quiz={54,64,94,84};
        while (true){
            System.out.print("Enter your index: ");
            int Index=sc.nextInt();
            try {
                System.out.println(quiz[Index]);
                break;
            }
            catch (Exception e){
                System.out.println("Index not found :(");
            }
        }

    }
}

