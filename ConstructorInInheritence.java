package com.company;
class Base_1{
    private int x;
    Base_1(){
        System.out.println("i am a constructor of base 1");
    }
    Base_1(int a){
        System.out.println("i am a constructor of base 1 have value of a: "+a);
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}
class Derived_1 extends Base_1{
    public int y;
    Derived_1(){
        //if we dont use super keyword then i am a constructor of base 1 will come as output
        super(7);  //i am a constructor of base 1 have value of a:7 it will get printed
        System.out.println("Constructor of derived class");
    }
    Derived_1(int x,int y){
       super(x);
        System.out.println("overloaded constructor of derived with y="+y);
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    static class DerivedDerived extends Derived_1{
        DerivedDerived(){
            System.out.println("i am constructor of derived derived ");
        }
        DerivedDerived(int x,int y,int z){
            super(x,y);
            System.out.println("i am overloaded constructor of derived_derived with z="+z);
        }
    }
}
public class ConstructorInInheritence {
    public static void main(String[] args) {
        System.out.println("___________________________________");
        Base_1 B=new Base_1();
            B.setX(43);
        System.out.println(B.getX());
        System.out.println("_________________________");
        Derived_1 D=new Derived_1();  //if we did'nt make a constructor in derived class than it take constructor of base class
   //When derived class extends from base class then the constructor of base class is executed first followed by constructor of derived class

        System.out.println("_____________________________");
        /*Derived_1.DerivedDerived Dd=new Derived_1.DerivedDerived();
        for the following inheritence hierachy the constructor are executed in order Base-->Derived_1--->DerivedDerived*/

/*
            Constructors During Constructor overloading----->

            When there are multiple constructor in parent class the constructor without any parameter is called from child class.

            If we want to call constructor with parameter from parent class we use super keyword.
         Super(a,b);  ---> Calls the constructor from parent class which take 2 variable.
*/
        System.out.println("__________________________________________");
       Derived_1 d=new Derived_1(4,9);
        System.out.println("_____________________");
        Derived_1.DerivedDerived Dd=new Derived_1.DerivedDerived();
        //above line will print--> i am a constructor of base 1
        //                        Constructor of derived class
        //                        i am constructor of derived derived
        System.out.println("__________________________");
        Derived_1.DerivedDerived cd=new Derived_1.DerivedDerived(3,4,9);

    }
}
