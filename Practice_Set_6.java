package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Practice_Set_6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        Create an array of 5 floats and calculate their sum.
    float sum=0;
    float []bmi= {45.32f,56.21f,260.2f,14.36f,78.69f};
        for (float element:bmi) {
            sum+=element;
        }
        System.out.println("the value of sum is : "+sum);

//Write a program to find out whether a given integer is present in an array or not.
        int given_num=sc.nextInt();
        int []arr={12,31,23,4,38};
        for (int element:arr) {
            if (element==given_num){
                System.out.println("its in array in index "+element);
            }
        }

        //Write a Java program to find the maximum and minimum element in a Java array.
        int []max_and_min_arr={45,23,56,69,15};
        System.out.println("max in this array is: "+ Arrays.stream(max_and_min_arr).max());
        System.out.println("min in this arrays is: "+ Arrays.stream(max_and_min_arr).min());



    }
}
