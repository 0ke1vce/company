package com.company;

@FunctionalInterface
interface  LambDemo{
    void meth1(int a);
}
/* ..
class DemoLamb implements LambDemo{
    @Override
    public void meth1() {
        System.out.println("this is method 1");
    }
}
*/

/*   .
interface  DemoAno{
    public  void meth1();
   public  void meth2();
}
*/


/* ..
    class AnoDemo implements DemoAno{
    @Override
    public  void meth1(){
        System.out.println("this is meth 1");
    }
    @Override
    public void meth2(){
        System.out.println("this is meth 2");
    }
}*/

public class AnonymousClassAndLambdaExpressions {
    public static void main(String[] args) {
           /*
   AnoDemo ad=new AnoDemo();  <--We don't need to do this if we want to use it once.
            ad.meth1();
            ad.meth2(); */


  /*   ...
            DemoAno obj=new DemoAno() {   //<-- here we use the interface
            @Override
            public void meth1() {
                System.out.println("this is meth 1");
            }


            public void meth2() {
                System.out.println("this is meth 2");
            }
        };
        obj.meth1();
        obj.meth2();
*/


   /* .
       LambDemo obj=new DemoLamb();
        obj.meth1();
        */

        //Using a lambda_expression
LambDemo obj=(a)->{System.out.println("this is method 1 from lambda expression "+a);};
        obj.meth1(69); 



    }
}


/*
Anonymous class is nothing but a class without any name.
They are used to override a class method or interface.
Anonymous classes in Java help us to write more concise and readable code.
 */