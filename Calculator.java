//Question Make a calculator using java with Inheritence or interface.
package com.company;
import  java.util.Scanner;
class Calculator_In_Java{
    Calculator_In_Java(){
        System.out.println("Welcome to our calculator ");
    }
    Scanner sc=new Scanner(System.in);
    public void Add(){
        System.out.println("Enter First number: ");
        float num1=sc.nextFloat();
        System.out.println("Enter Second number: ");
        float num2=sc.nextFloat();
        System.out.println("Addition of both number is: "+(num1+num2));
    }
    public  void Subtract(){
        System.out.println("enter first number: ");
        float num1=sc.nextFloat();
        System.out.println("enter Second number: ");
        float num2=sc.nextFloat();
        System.out.println("Subtraction of both number is "+(num1-num2));
    }
    public void multiply(){
        System.out.println("Enter first number: ");
        float num1=sc.nextFloat();
        System.out.println("Enter Second number: ");
        float num2=sc.nextFloat();
        System.out.println("Multiplication of both number is "+(num1*num2));
    }
    public  void divide(){
        System.out.println("Enter first number ");
        float num1=sc.nextFloat();
        System.out.println("Enter Second number ");
        float num2= sc.nextFloat();
        try {
            System.out.println("Division of both number is "+(num1/num2));
        }
        catch (Exception e){
            System.out.println("Division by zero error:");
        }
    }
}
public class Calculator{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Calculator_In_Java myC=new Calculator_In_Java();
        while (true){
            System.out.println("Enter your choice:\n1-Addition\n2-Subtraction" +
                    "\n3-Multiply\n4-Division\n5-Exiting the loop ");
            int choice=s.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Doing Addition");
                    myC.Add();
                    break;
                case 2:
                    System.out.println("Doing subtraction");
                    myC.Subtract();
                    break;
                case 3:
                    System.out.println("Doing Multiplication");
                    myC.multiply();
                    break;
                case 4:
                    System.out.println("Doing Division");
                    myC.divide();
                    break;
                case 5:
                    System.out.println("Exiting The Calculator");
                    break;
                default:
                    System.out.println("Enter a valid choice 1,2,3,4,5");
                    break;
            }
        }
    }
}
