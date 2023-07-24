package com.company;
import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        break in loops
       /* for (int i=0;i<5;i++){
            System.out.println(i+" Java is great");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }
        System.out.println("Loop ends here!!");*/
       /* int i=0;
        while (i<50){
            System.out.println("Java is great: "+i);
            i++;
            if (i==10){
                System.out.println("loop ending..");
                break;
            }
        }
        System.out.println("loop ends here");*/

//        Continue in Java
       /* for (int i=5;i>-7;i--){
            if (i==0){
                System.out.println("here is 0 skips the iteration");
                continue;
            }
            System.out.println("loop: "+i);
        }*/

        /*
    break statement completely exits the loop
    continue statement skips the particular iteration of the loop.
*/

    }
}

// break statement is used to exit the loop irrespective of whether the condition is true or false.
//continue statement is used to immediately move to the next iteration of the loop.
