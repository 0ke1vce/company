package com.company;

import java.util.Scanner;

class Circle{
    int radius;
    public float getArea(){
        System.out.print("Area of circle of radius "+radius+"m is ");
        return 3.14f*radius*radius;
    }
    public float getPerimeter(){
        System.out.print("Perimeter of circle of radius "+radius+"m is ");
        return 2*3.14f*radius;
    }
}

class Player{
    public String walk(){
        return "walking";
    }
    public String run(){
        return "running";
    }
    public String swim(){
        return "swimming";
    }
    public String fire(){
        return "firing";
    }
}

class Rectangles{
    int length;
    int breath;
    public int getArea(){
        System.out.print("Area of rectangle of length "+length +"m and breath "+breath+"m is ");
        return length*breath;
    }
    public int getPerimeter(){
        System.out.print("Perimeter of rectangle of length "+length +"m and breath "+breath+"m is ");
        return 2*(length+breath);
    }
}

class square{
    int side;
    public int getArea(){
        System.out.print("Area of square of side "+side+"m is ");
        return side*side;
    }
    public int getPerimeter(){
        System.out.print("Perimeter of square of side "+side+"m is ");
        return 4*side;
    }
}

class cellphone{
    public String To_Call(){
        return "Calling";
    }
    public String To_message(){
        return "Messaging";
    }
    public  String TO_Open_game(){
        return "opening Game";
    }
    public  String Shut_down(){
        return "power off";
    }
}
class Employees{
    Scanner sc=new Scanner(System.in);
    int salary;
    String name;
    public void getName(){
        System.out.println("Your name is: "+name);
    }
    public  void getSalary(){
        System.out.println("Your salary is: "+salary);
    }
    public void setName(){
        System.out.println("Enter new name: ");
        String new_name=sc.nextLine();
        System.out.print("Name changes from "+name+" to ");
        name=new_name;
        System.out.println(name);
    }
}

public class Practice_Set_8 {
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);

    /*question -1
            Create a class Employee with the following properties and methods:
Salary (property) (int)
getSalary (method returning int)
name (property) (String)
getName (method returning String)
setName (method changing name)
     */
        System.out.println("_________________________________________________");
        Employees ujjwal=new Employees();
        ujjwal.name="Ujjwal";
        ujjwal.salary=700000;
        ujjwal.getName();
        ujjwal.getSalary();
        ujjwal.setName();
        ujjwal.getName();
        System.out.println("_________________________________________________");
        /*question-2
    Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
     */
    //object of this cellphone is samsung for example.
    cellphone Samsung=new cellphone();
    System.out.println("Press 1-for call\nPress 2-for message\nPress 3-for opening game\nPress 4-for power off");
        int choice=s.nextInt();
        if (choice==1){
            System.out.println(Samsung.To_Call());
        }
        else if (choice==2) {
            System.out.println(Samsung.To_message());
        }
        else if (choice==3) {
            System.out.println(Samsung.TO_Open_game());
        }
        else if (choice==4) {
            System.out.println(Samsung.Shut_down());
        }
        else {
            System.out.println("enter valid option 1,2,3,4");
        }
        System.out.println("_________________________________________________");
//question-3 Create a class Square with a method to initialize its side, calculating area, perimeter
        square Side_4=new square();
        Side_4.side=4;
        System.out.println(Side_4.getArea());
        System.out.println(Side_4.getPerimeter());
        System.out.println("_________________________________________________");

        //question-4 Create a class Rectangle with a method to initialize its side, calculating area, perimeter
        Rectangles length_4_breath_8=new Rectangles();
        length_4_breath_8.length=4;
        length_4_breath_8.breath=8;
        System.out.println(length_4_breath_8.getArea());
        System.out.println(length_4_breath_8.getPerimeter());
        System.out.println("_________________________________________________");

// question 5 Create a class player for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
        Player Carl_Johnson=new Player();
        System.out.println(Carl_Johnson.walk());
        System.out.println(Carl_Johnson.run());
        System.out.println(Carl_Johnson.swim());
        System.out.println(Carl_Johnson.fire());

        System.out.println("________________________________________");

        //question-6 Create a class Circle with a method to initialize its radius, calculating area, perimeter
  Circle radius_4=new Circle();
  radius_4.radius=4;
        System.out.println(radius_4.getArea());
        System.out.println(radius_4.getPerimeter());

        System.out.println("__________________________________________________");
    }

}

