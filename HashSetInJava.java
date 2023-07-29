package com.company;

import java.util.HashSet;

public class HashSetInJava {
    public static void main(String[] args) {
        HashSet <Integer> h1=new HashSet<>();
        h1.add(6);
        h1.add(8);
        h1.add(3);
        h1.add(11);
//        h1.add(11);  doesn't add in our hash set

        //to clear our hashset
//        h1.clear();

        System.out.println(h1.contains(8));//return true if it contains 8

//        System.out.println(h1.isEmpty());
        //return true if our hashset is empty

        //To Clone a hashset
      /* .
        HashSet <Integer>h2=new HashSet<>();
       h2=(HashSet)h1.clone();
        System.out.println("h2");
        System.out.println(h2);
       */

        //to remove an object if present in hashset
        h1.remove(8);

        //to find size of hashset
        System.out.println(h1.size());

        System.out.println(h1);
    }
}
