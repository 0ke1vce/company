package com.company;

public class QuestionPatternPrinting {
    public static void main(String[] args) {

        //print the following-:
        /*
        SOLID RECTANGLE--->
        *****
        *****
        *****
        *****

         */
        for (int i=1;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //print the pattern-:
        /*
        HOLLOW RECTANGLE-->
        ******
        *    *
        *    *
        ******

         */

       int n=4;
       int m=5;
       for (int i=1;i<5;i++){
           for (int j=1;j<=m;j++){
               // -->cell(i,j)
               if (i==1||j==m||i==n||j==1){
                   System.out.print("*");
               }
               else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }


        //Print the pattern
        /*
        HALF PYRAMID

        *
        **
        ***
        ****
        *****

         */
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Print the pattern
        /*
        INVERT HALF PYRAMID

       *****
       ****
       ***
       **
       *

         */
        for (int i=1;i<=5;i++){
            for (int j=0;j<=5-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //print the following
        /*
       Half Pyramid inverted by 180degree

             *        3space+1star
            **       2space+2star
           ***       3space+1star
          ****      4space+4star

         */
         for (int i=1;i<=4;i++){
             //inner loop one for printing space
             for (int j=1;j<=4-i;j++){
                 System.out.print(" ");
             }
             //inner loop two for star
             for (int j=1;j<=i;j++){
                 System.out.print("*");
             }
             System.out.println();
         }


         //print the following-
        /*
        NUMBER PYRAMID

        1
        12
        123
        1234
        12345

         */
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //print the following-
        /*
        NUMBER PYRAMID inverted

        12345
        1234
        123
        12
        1

         */
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
