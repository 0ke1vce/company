
import java.util.Scanner;


public class Practice_Set_7 {

   /* static  void table_of_n(int n){
        System.out.println("this is table of "+n);
        int i=1;
        while (i<=10){
            int x=n*i;
            System.out.println(n+"X"+i+"="+x);
            i++;
        }
    }*/

/*static void pattern(){
    int v=4;
    for (int i=0;i<=4;i++){
        for (int j=0;j<i;j++){
            System.out.print("* ");
        }
        System.out.println(" ");
    }
}*/

   /* static  int sum_first_natural(int a){
        if (a==1){
            return 1;
        }
        else {
            return a+sum_first_natural(a-1);
            //Logic-  sum(n)=1+2+3+...+(n-1)+n    AND   sum(n-1)=1+2+3+...+(n-1)  so we can write sum(n)=sum(n-1)+n
        }
    }*/

 /*   static void reverse_pattern(int a){
        for(int i=a;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }*/

/*static void fibbonaci_series_n_th_term(){
    int n1=0,n2=1,n3,i,count=10;
    for (i=0;i<count;i++){
        n3=n1+n2;
        n1=n2;
        n2=n3;
    if (i==7){  //here i ==7 because first two term are 0,1 we are iterating through 3rd term
        System.out.println("10'th term is: "+n3);
    }

    }

}*/

   /* static int fibbonaci_series_n_th_term_recursion(int y){
      /*
//        if (y==1){
//
//            return 0;
//        }
//        else if (y==2){
//            return 1;
//        }

       if(y==1 || y==2){
           return y-1;
       }
        else {
            return fibbonaci_series_n_th_term_recursion(y-1)+fibbonaci_series_n_th_term_recursion(y-2);
        }
        }*/

/*static float change_temp(float a){
//    f=(9*c)/5+32
    float f;
    f=(9*a)/5+32;
    return f;
}*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //question 1 write a java method to  print multiplication  of a number n.
  /*      System.out.print("which number you want table: ");
        int y=sc.nextInt();
        table_of_n(y);*/

        //question 2 write a program to print the following using function
        /*

         *
         * *
         * * *
         * * * *

         */
//        pattern();

//question 3 write recursive function to calculate sum of first n natural number.
//        System.out.println(sum_first_natural(5));

        /*        question 4 write function to print following program
         * * * *
         * * *
         * *
         *
         */
//        reverse_pattern(4);

        //question 5 write a function to print 10th term of fibbonaci series
//       fibbonaci_series_n_th_term();

// question 6 write a function to print 10th term of fibbonaci series using recursion
     /*   System.out.print("whats the nth term: ");
        int a=sc.nextInt();
      int x=fibbonaci_series_n_th_term_recursion(a);
        System.out.println(x);*/

       // question 7 write function to convert celcius to farhenhiet
    /*    System.out.print("Enter temprature to change into farheniet: ");
        float x= sc.nextFloat();
        System.out.println(change_temp(x));*/

        


    }
}