package com.company;

class Gm extends Thread{
    public  void run(){
        int i=0;
        while (i<50){
            System.out.println("Good Morning..!");
            i++;
        }
    }
}

class Welcome extends Thread{
    public void run(){
        int i=0;
        while (i<50){
      /*      try {
                Thread.sleep(200);
            }
            catch (Exception e) {
                System.out.println(e);
            }*/
        System.out.println("Welcome!...");
        i++;
    }
        }
}

public class Practice_Set_13 {
    public static void main(String[] args) {
        Gm g=new Gm();
        Welcome w=new Welcome();
        g.setPriority(Thread.MAX_PRIORITY);
        w.setPriority(Thread.MIN_PRIORITY);
        System.out.println("priority of good morning is "+g.getPriority());
        System.out.println("priority of welcome is "+w.getPriority());
        System.out.println(g.getState());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread());
        g.start();
        w.start();

    }
}
