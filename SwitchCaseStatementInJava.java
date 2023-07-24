package com.company;
import java.util.Scanner;

public class SwitchCaseStatementInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age: ");
        int age=sc.nextInt();

        switch (age){
            case 18 :
                System.out.println("you are going to become adult");
                break;
            case 23:
                System.out.println("going to have a job");
                break;
            case 60:
                System.out.println("retire");
                break;
            default:
                System.out.println("enjoy");
        }


//        we can also use enhanced switch
        String var = "Saurabh";


        switch (var) {
            case "Shubham" -> {
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
            }
            case "Saurabh" -> System.out.println("You are going to join a Job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");
    }
}

//Switch case is used when we have to make a choice between number of alternatives for a given variable.
/*Syntax-:
 Switch(var) {                  //Here var can be integer,char or string in Java
    Case C1:
   	 //Code;
   	 break;

    Case C2:
   	 //Code;
   	 break;

    Case C3:
   	 //Code
   	 break;

    default:
   	 //Code
}
*/

