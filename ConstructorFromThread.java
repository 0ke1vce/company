package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("thank You!");
  /*
        int i=0;
        while (i<50){
            System.out.println("i am a thread: ");
            i++;
        }
        */
    }
}

public class ConstructorFromThread {
    public static void main(String[] args) {
        MyThr Mthr=new MyThr("ujjwal");
        Mthr.start();
        System.out.println("id of thread is: "+Mthr.getId());
        System.out.println("name of thread is: "+Mthr.getName());

        MyThr Mthr1=new MyThr("Harry");
        System.out.println("id of thread is: "+Mthr1.getId());
        System.out.println("name of thread is: "+Mthr1.getName());


    }
}
