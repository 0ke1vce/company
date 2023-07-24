package com.company;

class Ekclass{
    Ekclass(int a){
        this.a=a;
    }

    public int getA() {
        return a;
    }

    int a;
    public int getone(){
        return 1;
    }
}

class Doclass extends Ekclass{
        Doclass(int c){//it will call the constructor which does'nt have any argument
            super(c);  //now it will call that constructor which have an argument in it.
            System.out.println("main ek constructor hu");
        }
}
public class This_and_Super_keyword {
    public static void main(String[] args) {
  Ekclass e=new Ekclass(5);
        System.out.println(e.getA());
        System.out.println("_________________");
  Doclass d=new Doclass(3);
        System.out.println(e.getA());

    }
}


/* This keyword-->
        this is a way for us to reference an object of the class which is being created/referenced.
        Example--> this.area=2  <---- this is a reference to current object.
        this is used to call default constructor of the class*/

/* Super keyword-->
        1-A reference variable used to refer immediate parent class object.
        2-It can be used to refer immediate parent class instance variable.
        3-It can be used to invoke the parent class method.
        4-It can be used to invoke the parent class constructor.
 */