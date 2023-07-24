package com.company;

class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;
        while(true){
//            System.out.println("I am a thread");
            /*
            The sleep() method in Java is useful to put a thread to sleep for a specified amount of time.
When we put a thread to sleep, the thread scheduler picks and executes another thread in the queue.
             */
            try {
                Thread.sleep(455);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Thank you: ");
        }
    }
}

class MyNewThr2 extends Thread{

    public void run(){
        int i=0;
        while(i<50){
//            System.out.println("I am a thread");
            System.out.println("My Thank you: ");
            i++;
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        // The join() method in Java allows one thread to wait until the execution of some other specified thread is completed.
//        t1.join();   <--It will give an exception so we have to use try catch statement.

  /*      try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
   */
        t2.start();
    }
}
