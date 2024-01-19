package com.company;
import java.util.Scanner;

public class FibbonaciSeriesInJava {
    static void fibbonaci_series(int n){
        int n1=0,n2=1,n3,i,count=n;
        System.out.print(n1+" ");
        for(i=1;i<count;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print( n1+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter terms in fibbonaci series: ");
        int x=sc.nextInt();
        fibbonaci_series(x);
    }
}
