package com.company;

class MythreadRunnable implements Runnable{
    @Override
    public void run() {
        int i=0;
        while (i<45){
            System.out.println("I am a thread ");
            i++;
        }

    }
}
class MythreadRunnable1 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while (i<45){
            System.out.println("I am a thread 1 ");
            i++;
        }
    }
}


public class MultiThreadingInJavaImplementingRunnableInteface {
    public static void main(String[] args) {
            MythreadRunnable bullet1=new MythreadRunnable();
             Thread gun1=new Thread(bullet1);

            MythreadRunnable1 bullet2=new MythreadRunnable1();
            Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();
        //to run a thread we can use thread_name.run();  when we implement runnable interface
    }
}
