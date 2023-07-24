package com.company;

import java.util.Scanner;

//question-1
//Create an abstract class pen with methods write () and refill () as abstract methods
abstract  class pen{
    abstract void write();
    abstract void refill();
}

//question-2
//Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
class fountainPen extends pen{
    public void write(){
        System.out.println("Writing");
    }
    public void refill(){
        System.out.println("refilling");
    }
    public void changeNib(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter nib length 1- 0.7mm or 2- 0.5mm");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("using 0.7mm");
                break;
            case 2:
                System.out.println("using 0.5mm");
                break;
            default:
                System.out.println("enter either 1 or 2");
                break;
        }
    }
}


//question-3
//Create a class monkey with jump() and bite() methods.
// Create a class human which inherits this monkey class and implements basic_animal interface with eat() and sleep() methods.
interface  BasicAnimal{
    public void eat();
    public void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("jumping:");
    }
    public void bite(){
        System.out.println("biting:");
    }
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("human eats:");
    }

    @Override
    public void sleep() {
        System.out.println("human sleeps:");
    }

    @Override
    public void bite() {
        System.out.println("human bites:");
    }

    @Override
    public void jump() {
        System.out.println("human jumps:");
    }
}

//question-4
//Create a class telephone with ring(),lift() and disconnected () methods as abstract methods.
// Create another class smart telephone and demonstrate polymorphism.
abstract  class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnected();
}
class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("ringing:");
    }
    public void lift(){
        System.out.println("lifting the telephone:");
    }
    public void disconnected(){
        System.out.println("disconnected:");
    }

    public void Smarttelephone_Play_music(){
        System.out.println("playing music");
    }


}

//question-6
//Create an interface TVremote and use it to inherit another interface smart TVremote and then a class tv which implements the methods.
interface TVremote{
    public void changeChannel();
    public void powerOff();
    public void changeDisplayOutput();
}
interface SmartTVremote extends TVremote{
    public void openPrime();
    public void openNetflix();
}
class TV implements TVremote,SmartTVremote{
    @Override
    public void changeDisplayOutput() {
        System.out.println("changing display output.....");
    }

    @Override
    public void changeChannel() {
        System.out.println("Changing channel..");
    }

    @Override
    public void openPrime() {
        System.out.println("opening Prime...");
    }

    @Override
    public void openNetflix() {
        System.out.println("opening Netflix!");
    }

    @Override
    public void powerOff() {
        System.out.println("POWERING OFF!!");
    }
}



public class Practice_Set_11 {
    public static void main(String[] args) {

        System.out.println("____________________");
        fountainPen fP=new fountainPen();
        fP.refill();
        fP.changeNib();
        fP.write();
        System.out.println("_________________________");

        Human hm=new Human();
        hm.eat();
        hm.sleep();
        hm.bite();
        hm.jump();
        System.out.println("_______________________________");

        Telephone tp=new SmartTelephone();
        //we can only use Telephone methods not smarttelephone methods because we refrenced as Telephone.
        tp.ring();
        tp.lift();
        tp.disconnected();
        System.out.println("___________");
//        tp.Smarttelephone_Play_music();      <------ it is not allowed.
        SmartTelephone stp=new SmartTelephone();
        //we can use any methods
        stp.ring();
        stp.lift();
        stp.disconnected();
        stp.Smarttelephone_Play_music();
        System.out.println("____________________________");


        //question-5
        //Demonstrate polymorphism using monkey  class from Q3
        Monkey m=new Human();
        m.jump();
        m.bite();
//        m.eat();   <-----it will give error because we give only monkey properties to human
        BasicAnimal b=new Human();
        b.eat();
        b.sleep();
//        b.bite();  <------------it will give error because we give only basic animal properties to human.
        System.out.println("________________________");

        TV tv=new TV();
        tv.changeChannel();
        tv.changeDisplayOutput();
        tv.openPrime();
        tv.openNetflix();
        tv.powerOff();
        System.out.println("_______________________________");

    }
}
