package com.company;

class MyThread extends Thread{
    @Override
    public  void run(){
        while (true) {
            System.out.println("PLaying VALORANT! ");
            }
        }
    }

class MyThread2 extends Thread{
    @Override
    public  void run(){
        while (true) {
            System.out.println("Reading BOOKS ");

        }
    }
}


public class MultiThreadingInJavaExtendingThreadClass {
    public static void main(String[] args) {
        /*
        func1();   -->thread
        func2();    --->thread
        func1 and func2 are running concurrently.
        //some other line of code
         */

        /*
        func1();  -->without threading
        func2();   --->without threading
        without thread at first func1 will be executed and then func2 will be executed.
        //some other line of code
         */


        MyThread t1=new MyThread();
        MyThread2 t2=new MyThread2();

        //to start a thread we can use thread_name.start(); when we extend thread class
        t1.start();
        t2.start();
        //kuch time valo khelega or kuch time books padega.


    }
}
