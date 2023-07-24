package com.company;

import java.util.Scanner;

public class MultidimensionalArrayInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        2-D array
        int [][] flats;
        flats=new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;

        // Displaying the 2-D Array (for loop)
        System.out.println("Printing a 2-D array using for loop");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        System.out.println("_____________________________________________________");

        int [][] student_room_id=new int[2][3];
        student_room_id[0][0]=101;
        student_room_id[0][1]=102;
        student_room_id[0][2]=103;
        student_room_id[1][0]=201;
        student_room_id[1][1]=202;
        student_room_id[1][2]=203;

        for(int i=0;i< student_room_id.length;i++){
            for(int j=0;j<student_room_id[i].length;j++){
                System.out.print(student_room_id[i][j]+" ");


            }
            System.out.println(" ");
        }


    }
}

//Multidimensional Arrays are an Array of Arrays. Each elements of an M-D array is an array itself.
// Marks in the previous example was a 1-D array.  in previous code