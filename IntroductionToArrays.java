package com.company;
import java.util.Scanner;
public class IntroductionToArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /*Classroom of 5 student you have to store marks
        We have two option we can make 500 variable or
        2- we can make an array.(reccomended)
         */

//        to make a array
        int [] mark;

        //array with memory allocation  {DECLARATAION_OF_ARRAY+MEMORY_ALLOCATION}
        int [] marks=new int[5];   //here 5 element should be store in our array

//Declaring array with initialize
        int [] mrks={12,21,14,53,43};

        //Why do we use array- Because accessing of data is easier and faster

        marks[0]=100;
        marks[1]=69;
        marks[2]=54;
        marks[3]=90;
        marks[4]=0;
        //marks[5]=34;  it will throw an error

        //Acessing element in array.
        System.out.println(marks[4]);

        //As array is mutable we can change value in array.
        marks[4]=10;
        System.out.println(marks[4]);  //it will give 10



 //To find length of array you can use .length method
        System.out.println(marks.length); //it will give 5



        //To display array
        System.out.println("___________________________");
        System.out.println("my array is: ");
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }




//      Write a Java program to print the elements of an array in reverse order.
        System.out.println("______________________________");
        System.out.println("Index in reverse order is: ");
        for (int i=(marks.length-1);i>=0;i--){
            System.out.println(marks[i]);
        }


        //to input in arrays
        int []u=new int[5];
        for (int i=0;i<u.length;i++){
            System.out.println("enter element to add in array:");
            u[i]=sc.nextInt();
        }
    }
}

//Array is collection of similar type of data.
/*
Syntax of making array-
         datatype [] Array_name;

Memory allocation in array-
   new datatype[Number_of_element_to_store]

 */

//Indexing in array starts from 0 and goes to (n-1) where n is  size of array.

// [0_index|1_index|2_index|3_index|4_index]   number of byte it take=no. of element X number of index
//  Here in above number of byte =5X4 =20 byte this array take

/* //To find length of array you can use .length method
Syntax-   array_name.length
 */

/*To display a array we can use for loop
Syntax-
    for (int i=0;i<Array_length;i++){
    System.out.println(array_name[i]);
    }
 */


// Array indices start from 0 and go till (n-1) where n is the size of the array.
