//  Need to understand properly.
package com.company;

class MythreadRunnableAndString implements Runnable{

    public MythreadRunnableAndString(String r, String name){
        super();
    }
    @Override
    public void run() {
        System.out.println("thank you: ");
    }
}

public class ConstructorFromThreadUsingRunnable {
    public static void main(String[] args) {
        MythreadRunnableAndString mthrAs=new MythreadRunnableAndString("yeah","ujjwal");
        Thread mthrAs1=new Thread(mthrAs);
        mthrAs1.start();
        System.out.println("id of thread is: "+mthrAs1.getId());
        System.out.println("name of thread is: "+mthrAs1.getName());
    }
}
