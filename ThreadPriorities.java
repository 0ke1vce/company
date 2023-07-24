package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run() {
        int i = 0;
        while (i < 60) {
            System.out.println("Thank you: " + this.getName());
            i++;
        }
    }

    }


public class ThreadPriorities {
    public static void main(String[] args) {
        /*
        In JVM there is-->
            Ready Queue which contain all the thread which are ready to run.  e.g--> T1,T2,T3,T4,T5
            thread scheduler is a component which maintain all these thread.
         */
        MyThr1 t1 = new MyThr1("Harry1");
        MyThr1 t2 = new MyThr1("Harry2");
        MyThr1 t3 = new MyThr1("Harry3");
        MyThr1 t4 = new MyThr1("Harry4");
        MyThr1 t5 = new MyThr1("Harry5 (most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
