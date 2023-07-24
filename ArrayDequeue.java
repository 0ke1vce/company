package com.company;
import java.util.*;
public class ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();

        ad2.add(324);
        ad2.add(323);
        ad2.add(321);
        ad2.add(332);


        ad1.add(6);  //Inserts the specified element at the end of this deque.
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5); //inserts at first of this dequeue
        ad1.addAll(ad2);  //inserts a collection at last of this dequeue

        //to get first index
        System.out.println(ad1.getFirst());   //also peekFirst();
        //to get last index
        System.out.println(ad1.getLast());   //also peekLast();

        System.out.println(ad1.contains(6));  //Returns true if this deque contains the specified element.

        System.out.println(ad1.isEmpty());  //Returns true if this deque contains no elements.

        System.out.println(ad1.size());   //Returns the number of elements in this deque.

      //  ad1.removeAll(ad2);  //Removes all of this collection's elements that are also contained in the specified collection (optional operation).

        System.out.println(ad1);

        /*
        Removes all  the elements from this deque.
        ad1.clear();
         */




    }
}


/*
***
ArrayDeque = Resizable array + Deque interface{insertion and deletion are from both front and end}.
***

ArrayDeque implements the Queue & Deque interface.
There are no capacity restrictions for ArrayDeque,
and it provides us the facility to add or remove any element from both sides of the queue.
Also known as Array Double Ended Queue.
It is faster than Linked list and stack.
 */
