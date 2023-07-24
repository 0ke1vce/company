package com.company;
import java.util.Scanner;

public class VariableArgumentsVarArgsInJava {

  /*  //Yeh h aam Jindagi
    static  int sum(int a,int b){
        int c;
        c=a+b;
        return c;
    }
    static  int sum(int a,int b,int c){
        int d;
        d=a+b+c;
        return d;
    }*/

    //Yeh h mentos jindagi
    static int add(int ... arr){
//        Available as int [] a;
        int result=0;
        for (int a:arr) {
            result+=a;
        }
        return result;
    }

//    if we want to give at least one parameter in method we can do like this
    static  int multiply(int a,int ...arr){  //at least one integer is required now
        int result=1;
        for (int i:arr) {
            result*=i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   /*     System.out.println("welcome to java!");

        //yeh h aam jindagi.
        System.out.println("sum of 4,5 is: "+sum(4,5));
        System.out.println("sum of 3,4,5 is: "+sum(4,5,3));
*/

        //Yeh h mentos jindagi
        System.out.println(add());
        System.out.println(add(1,2));
        System.out.println(add(2,3,4));
        System.out.println(add(4,5,6));

// if we want to give atleast one argument
        System.out.println(multiply(1,2,4));
//        System.out.println(multiply());  it will give an error as this method will take minimum one argument
        System.out.println(multiply(2,3,54,65,34));

    }


}


//Varargs in java syntax-:
    /*
    static void foo(int … arr){
// arr is available here as int[] arr
}
    */