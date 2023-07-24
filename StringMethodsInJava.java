package com.company;
import java.util.Scanner;

public class StringMethodsInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name="Ujjwal";
        System.out.println(name);

//        To check the length of string
        int length_of_string=name.length();
        System.out.println(length_of_string);

//        to give a new string which are in lowercase
        String lstring=name.toLowerCase();
        System.out.println(lstring);

//        to give a new string which are in upppercase
        String Ustring=name.toUpperCase();
        System.out.println(Ustring);

//       to give a new string after removing all the trailing and leading spaces from orignal string
        String nonTrimmed=" Ujjwal " ;
        String trim_str=nonTrimmed.trim();
        System.out.println(trim_str);

//        To return a substring   Syntax-:   name.substring(start,end);   if start is not given it's 0 index location and end is last index.
        System.out.println(name.substring(3,5)); //here start from 3 rd index to (5-1)index so end is 4th index so answer is wa.
//        Returns a substring from start to end . Start index is included but end is excluded.

//        To return a new string by replacing some word from orignal string
            String replace_str=name.replace("j","k");
        System.out.println(replace_str);   //orignal str is ujjwal and replaced string is ukkwal

//to check if a string starts with a substring given return true if it happen otherwise false
        System.out.println(name.startsWith("Uj"));  //ti will return true
        System.out.println(name.startsWith("jw")); //it return false

        //to check if a string ends with a substring given
        System.out.println(name.endsWith("al")); //return true
        System.out.println(name.endsWith("z")); //return false

// to get character from index location we can use the following-:
        System.out.println(name.charAt(3));  //name=Ujjwal so at 3rd index location it is w

//        to get the index of first occurance from our substring
        System.out.println(name.indexOf("w")); //it will give 3 as w is on 3rd index.
        System.out.println(name.indexOf("k"));  //as k is not in our string so it give -1 as answer.
        System.out.println(name.indexOf("wal"));  //as wal first occur on index 3 so 3 is returned.

//        to check from  index from our desired position we can do like this
        System.out.println(name.indexOf("j",2)); //it will start our search from second index (ujjwal) so 2 is returned.
            //if we don't get the substring acc to string then -1 will be returned.

//        to get the last index from substring
        System.out.println(name.lastIndexOf("wal"));  //search direction from back as it search from lawjju

//        to check if given string is equal to string
          String new_str="Ujjwal";
        System.out.println(name.equals(new_str)); //gives True
        String new_str_2="bjdkhdei";
        System.out.println(name.equals(new_str_2)); //gives false

//        to check if two strings are equal by ignoring teh case i.e uppercase and lowercase

        String n_str="ujjwal";
        System.out.println(name.equalsIgnoreCase(n_str));//return True

//To get double quote in our string
        System.out.println("this is java\" double quote");


    }
}

/*Escape Sequence Characters :
    The sequence of characters after backslash ‘\’ = Escape Sequence Characters
    Escape Sequence Characters consist of more than one character but represent one character when used within the strings.
    Examples: \n (newline), \t (tab), \’ (single quote), \\ (backslash), etc.
*/