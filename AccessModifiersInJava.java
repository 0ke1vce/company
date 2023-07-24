package com.company;
class C1{
    public  int x=5;
    protected  int y=4;
    int z=6;
    private int q=54;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(q);
    }

}

class C2 extends C1{
    public  void meth2(){
        System.out.println(z);
        System.out.println("meth2");
    }

}
class C3{}
public class AccessModifiersInJava {
    public static void main(String[] args) {
    C1 c1=new C1();
    //c1.meth1();
        System.out.println(c1.x);
        System.out.println(c1.y);
        System.out.println(c1.z);
//        System.out.println(c1.q);   <----as it is private so we can't access it.. in same package..
C2 c2=new C2();
        System.out.println(c2.x);
        System.out.println(c2.y);
        System.out.println(c2.z);
//        System.out.println(c2.q);   // as it's private we can't access in subclass




    }
}

/*

Modifier               Class  Package  Subclass  World
Public                  Y       Y       Y       Y
Protected               Y       Y       Y       N
Default(no.modifier)    Y       Y       N       N
Private                 Y       N       N       N

 */