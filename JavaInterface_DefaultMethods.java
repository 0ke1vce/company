package com.company;
interface MyCamera{
    void takeSnap();
    void recordVideo();
   private void greet(){
        System.out.println("Good Morning");
    }
  default void record4KVideo(){  //a default methods
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
        public void record4KVideo(){  //overriding the default method of interface
        System.out.println("Taking snap and recoding in 4k");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"ke1vce", "ohaiyo", "UJ5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}

interface PetAnimal{
    // Default method
    default void say(){
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void bark();
}
 class PetDog implements PetAnimal {
    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
}

public class JavaInterface_DefaultMethods {
    public static void main(String[] args) {

        MySmartPhone ms=new MySmartPhone();
      ms.record4KVideo();
//         ms.greet(); --> Throws an error!  because it's a private method
        String[] ar = ms.getNetworks();
        for (String item: ar) {
            System.out.println(item);}
        System.out.println("____________________");

       PetDog dg=new PetDog();
       dg.bark();
       dg.say();
        System.out.println("__________________");

    }
}

/*
        default method enable us to add new functionality to existing interfaces.
        Classes implementing the interfaces need not implement the default methods.
        Interfaces can also include private method for default methods to use. example greet is used by record4KVideo above.


 */