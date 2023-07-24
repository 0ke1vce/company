package com.company;
import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class For_Each_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []marks={9998,3342,32423,234};

        //            for each loop is enhanced of for loop
        for (int i:marks) {
            System.out.println(i);
        }

        int [] ujjwal={23,43,54};
        for (int element:ujjwal) {
            System.out.println(element);
        }


    }
}

/*
for (int element:Arr) {
            System.out.println(element);    //Prints all the elements
}*/

//Example-:
/*
class CWH_forEachLoop{
  public static void main(String args[]){
   //declaring an array
   int arr[]={1,2,3,3,4,5};
   //traversing the array with for-each loop
   for(int i:arr){
     System.out.println(i);
   }
 }
}
 */

