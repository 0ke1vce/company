package com.company;

import java.util.ArrayList;
import java.util.Scanner;
class Mygeneric<T1>{
    int val=344;
    private T1 t1;
    Mygeneric(int val,T1 t1){
        this.val=val;
        this.t1=t1;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class GenericsInJava {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList();
//        ArrayList<int> arrayList = new ArrayList(); -- this will produce an error
//        arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(643);
//        arrayList.add(new Scanner(System.in));
//        int a = (int) arrayList.get(0);
        int a = (int) arrayList.get(0);
        System.out.println(a);




        Mygeneric <String> g1=new Mygeneric<>(23,"string");
//        g1.setT1("hello");
        String str= g1.getT1();
        System.out.println(str);
    }
}



/*
The Java Generics helps us to deal with the compiler time type-safety.
With the help of the Generics, we can write a single method and call it with different argument types(integer, strings, etc.).
 */

/*
    Bugs can be detected at compile-time:
While developing any application or program, it is always better to catch the bug/problem at the compile-time instead of runtime so that we can provide a smooth experience to the user.
Let's take an example to see how Java Generics helps us to detect problems at compile-time:

 */

/*

Let's suppose you created an ArrayList(without using Generics),
and you want to store the value at index 0 into an integer variable named "x." Are you allowed to do this in Java?
The answer is a big NO! This is because the ArrayList returns an object, but we're storing the value in an integer variable.
In such cases, we need to type-cast the object into our desired data type. But, if we use Generics, then there is no need to typecast
 */