package com.company;

class A{
    int a;
    public  int ujjwal(){
        return 4;
    }
    public void met2(){
        System.out.println("i am method 2 of class A");
    }
}
class B extends A{
    @Override //using override is a good practice
    public void met2() {    //it will override this method in class B
        System.out.println("i am method 2 of class B");
    }

    public void meth3(){
        System.out.println("i am method 3 of class B");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
   A a=new A();
   a.met2();
   B b=new B();
   b.met2();

    }
}

/*If the child class implements the same method present in the parent class again, it is known as method overriding.
Method overriding helps us to classify a behaviour that is specific to the child class.
The subclass can override the method of the parent class only when the method is not declared as final. */

//Simply we can say that Redefining method of super class! in sub class.



//Difference between method overloading and overriding
/*
        method overloading are in same class i.e same method name with diffrent parameters whereas
        method overriding happen in diffrent class in which method of superclass is redefined in subclass.
*/
