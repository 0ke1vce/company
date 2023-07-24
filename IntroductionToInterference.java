package com.company;


interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 45;            //We can't extend multiple abstract classes but we can implement multiple interferences.
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{      //We can't extend multiple abstract classes but we can implement multiple interferences.
    //public int x = 5;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }
    public void uj(){
        System.out.println("thats a method of AvonCycle");
    }
}
public class IntroductionToInterference {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycle.a);
        System.out.println(cycle.x);
 
        // You cannot modify the properties in Interfaces as they are final
        // cycle.a = 454;
        //System.out.println(cycle.a);

        cycle.blowHornK3g();
        cycle.blowHornmhn();
        cycle.uj();
    }
}



// to implement an interface we have to make the method public.
    //Interference is group of related method  with empty bodies.



/*
interface in java is a collection of abstract methods.
The interface is one more way to achieve abstraction in Java.
An interface may also contain constants, default methods, and static methods.
All the methods inside an interface must have empty bodies except default methods and static methods.
We use the interface keyword to declare an interface.
An interface cannot contain a constructor (as it cannot be used to create objects)
In order to implement an interface, java requires a class to use the implement keyword.
 */