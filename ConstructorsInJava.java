package com.company;
import java.util.Scanner;

class MyMainEmployee{
    private    int id;
    private  int salary;
    private String name;
    public MyMainEmployee(String myName,int ID) {
        id=ID;
        name=myName;
    }
    public MyMainEmployee(String myName){   //Constructors can be overloaded.
        id=0;
        name=myName;
    }
    public MyMainEmployee(){
        id=1;
        name="KP";
        salary=10000;
    }
    //this is the overloaded constructor
    public MyMainEmployee(int n){
        id=1;
        name="KP";
        salary=60000;
    }
    public void setSalary(int n){
        salary=n;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String n){
        name=n;
    }
    public String getName() {
        return name;
    }
    public void setId(int n) {
        id=n;
    }
    public int getId() {
        return id;
    }
}

public class ConstructorsInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
MyMainEmployee Ujjwal=new MyMainEmployee("ujjwal",69);
 /*       Ujjwal.setName("Ujjwal Patni");
        Ujjwal.setId(45);*/
        System.out.println(Ujjwal.getName()); //constructor is like a method.
        System.out.println(Ujjwal.getId());
        System.out.println("______________________");
        MyMainEmployee Default=new MyMainEmployee("Constrctor can be overloaded");
        System.out.println(Default.getName());
        System.out.println(Default.getId());
        System.out.println("________________________________");
        MyMainEmployee KP=new MyMainEmployee(65);
        System.out.println(KP.getId());
        System.out.println(KP.getName());
        System.out.println(KP.getSalary());

    }
}
