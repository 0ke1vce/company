package com.company;
import java.util.*;
public class LinkedListInjava {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5);
        l1.add(0, 1);
        l1.addAll(0, l2);    //it will add one collection to other
        l1.addLast(676);   //it is a linked list method which add element at last  position
        l1.addFirst(788);   //it is linked list method which add element at first position
        System.out.println(l1.contains(27));  //return true if l1 contains 27 otherwise false
        System.out.println(l1.indexOf(6));   //it will give index of first occurance of 6
        System.out.println(l1.lastIndexOf(6));
        //l1.clear();
           l1.set(1, 566);  //To  Replaces the element at the specified position in this list with the specified element.
        System.out.println(l1);

        //to return first element of list
        System.out.println(l1.getFirst());
        //to return last element of list
        System.out.println(l1.getLast());
        //to return element of specified index location
        System.out.println(l1.get(5));


        //Retrieves and removes the head (first element) of this list.
        System.out.println(l1.remove(1));  //remove element of index 1
        //Removes and returns the first element from this list.
        System.out.println(l1.removeFirst());
        //Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
        System.out.println(l1.removeFirstOccurrence(6));  //remove 6 from first occurence return true if object is in list
        //to Returns the number of elements in this list.
        System.out.println(l1.size());


        //Pops an element from the stack represented by this list.
        System.out.println(l1.pop());   //removes first element
        //To Pushes an element onto the stack represented by this list.
        l1.push(56);//add element at first index
        //to see first index
        System.out.println(l1.peek());
        //to see last index
        System.out.println(l1.peekLast());

//      Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        System.out.println(l1.indexOf(56));  //return -1 if object is not in list


        System.out.println(l1);
      /*
      For iterating linked list
       for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }*/
    }}


/*
LinkedList class in Java provides us with the doubly linked list data structure.
Each element of the linked list is known as a node.
Each node points to the address of the next node & its previous node.

//Linked lists are preferred over the Array list because the insertion & deletion in the linked lists can be done in a constant time.
But, in arrays, if we want to add or delete an element in between then, we need to shift all the other elements.

**In a linked list, it is impossible to directly access an element because we need to traverse the whole linked list to get the desired element.
 */