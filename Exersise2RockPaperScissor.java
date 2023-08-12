package com.company;
import  java.util.Scanner;
import  java.util.Random;
public class Exersise2RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();


        int i=0;
        int usr_point=0;
        int comp_point=0;

//        Game design
        while (i<=4){

            //User choice
            System.out.println("0- for rock,1- for paper ,2- for scissor");
            int usr_choice=sc.nextInt();
            System.out.println("User entered: "+usr_choice);

            //Computer choice
            int upper_bond=3;
            int comp_choice=rand.nextInt(upper_bond);  //0 se start hoke upper limit-1 tak jayega or random number lega
            System.out.println("Computer entered: "+comp_choice);

            if ((usr_choice==0 && comp_choice==2 )|| (usr_choice==1 && comp_choice==0) || (usr_choice==2 && comp_choice==1)){
                System.out.println("user win");
                usr_point+=1;
                i+=1;
            }
            else if ((usr_choice==2 && comp_choice==2 )|| (usr_choice==1 && comp_choice==1 )|| (usr_choice==0 && comp_choice==0)) {
                System.out.println("its a tie");
                i+=1;
            }
            else if (usr_choice == 0 || usr_choice == 1 || usr_choice == 2) {
                System.out.println("computer win");
                comp_point+=1;
                i+=1;
            }
            else {
                System.out.println("Please enter  valid number 0,1,2..");
                i+=1;
            }
        }

//        results
        System.out.println("......................................................................");
        System.out.println("computer points: "+comp_point);
        System.out.println("user points: "+usr_point);
        System.out.println("..........................................................................");
        if (comp_point>usr_point){
            System.out.println("Computer wins by "+comp_point+" points");
        }
        else if (usr_point>comp_point) {
            System.out.println("user wins by "+comp_point+ " points");
        }
        else {
            System.out.println("its a tie");
        }
    }
}
