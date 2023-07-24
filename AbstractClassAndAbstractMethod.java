package com.company;

abstract class Parent {
    public Parent() {
        System.out.println("i am a constructor of parent");
    }

    public void sayHello() {
        System.out.println("HEllo!!");

    }

    abstract void greet();// to run this method we have to make an abstract class

}

class Child extends Parent {
    Child() {
        System.out.println("i am constructor of Child");
    }

    public void greet() { // it is neccesary to override the abstract method otherwise we have to make
                          // this class abstract.
        System.out.println("good morning");
    }
}
// class Child1 extends Parent{ //to make this code run we have to either
// override all the abstract method or make this class abstract.
// public void Good(){
// System.out.println("i am good");
// }}

public class AbstractClassAndAbstractMethod {
    public static void main(String[] args) {

        // It is not possible to create an object of an abstract class.
        // Parent p=new Parent() {};
        Child c = new Child();
        c.greet();
    }

}

/*
 * Its is possible to create reference of an abstract class.
 * It is not possible to create an object of an abstract class.
 */