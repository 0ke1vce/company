package com.company;
class phone{
    public void on(){
        System.out.println("Turning on Phone....");
    }
    public void showTime(){
        System.out.println("Showing time..");
    }
}
class Smartphone extends phone{
    @Override
    public void on() {
        System.out.println("Turning On Smartphone..");
    }
    public void music(){
        System.out.println("Playing Music");
    }
}
public class DynamicMethodDispatchInJava {
    public static void main(String[] args) {
/*        phone obj=new phone();   //<--allowed  //object is created during run-time.
        Smartphone smobj=new Smartphone();  //<--allowed */


   /*This is called upcasting-> technique in which a superclass reference variable refers to the object of the subclass.*/
    phone obj=new Smartphone(); //yeh karke ham phone class k method bhi use kr skte hai
    //smartphone ko phone bol sakte hai.
//    Smartphone obj2=new phone();   //phone kko smartphone nhi bol sakte hai.
    //the reference of super class can be equal to the object of sub class.
    //e.g- we can say for both nokia 1100 and iphone 14 as phone but we can't say nokia 1100 as smartphone.
    obj.showTime();
    obj.on();   //yeh object ka run hoga jo es case m Smartphone() hai
//    obj.music();  //<--- this is not allowed



    }
}

//Dynamic method dispatch is also known as run time polymorphosis because object creation happens on runtime.
