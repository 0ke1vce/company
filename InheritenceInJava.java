package com.company;
class Base{
    int x;
    Base(){
        System.out.println("i am constructor");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("in Base Setting X now");
        this.x = x;
    }
    public  void printMe(){
        System.out.println("prints me");
    }
}
class Derived extends Base{
    int y;


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}



//Quiz
class  Animal{
    String b;
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
class Dog extends Animal{
    String bark="Bark";
}


public class InheritenceInJava {
    public static void main(String[] args) {
        //creating an object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        //we can also make a derived class object and set and get x.
        System.out.println("______________________________");
        Derived d=new Derived();
        d.setX(60);
        System.out.println(d.getX());

        //quiz from animal class inhert property of animal to dog
        Dog dog=new Dog();
        dog.setB("have legs");
        System.out.println(dog.getB());
        System.out.println(dog.bark);


    }
}


/* Inheritence is use to borrow properties and method from an existing class*/
// as property of Phone-->Properties of SmartPhone similarly
//Superclass--->Subclass