package com.company;

import java.util.Scanner;

class Sphere{
    Scanner sc=new Scanner(System.in);
    private  int radius;
    public Sphere(){
        System.out.print("Enter radius of Sphere: ");
        radius= sc.nextInt();
    }
    public double surfaceArea(){
        double SurfaceArea=(Math.PI*4*radius*radius);
        return SurfaceArea;
    }
    public double Volume(){
        double Volume=(Math.PI*4*radius*radius*radius)/3;
        return Volume;
    }
}
class Rectangle{
    private int length;
    private int breath;
    public Rectangle(){
        length=4;
        breath=5;
        System.out.println(length+" and "+breath);
        System.out.println("___________________________________");
    }

    public Rectangle(int l,int b){
        length=l;
        breath=b;
        System.out.println(length+" and "+breath);
        System.out.println("___________________________________");
    }
}
class cylinder {
    private int radius;
    private int hieght;
    public cylinder(int r,int h){
        radius=r;
        hieght=h;
    }
 /*   public void setRadius(int r) {
        radius=r;
    }
    public void setHieght(int h) {
        hieght = h;
    }
    public int getHieght() {
        return hieght;
    }
    public int getRadius() {
        return radius;
    }*/
    public float volume(){
        float volume_cy=3.14f*radius*radius*hieght;
    return volume_cy;
    }
    public float surfaceArea(){
        float surface_Area=2*3.14f*radius*(hieght+radius);
        return surface_Area;
    }

}

public class Practice_Set_9 {
    public static void main(String[] args) {
        //question 1 create a class cylinder and use getter and setters to set its radius and height
    /*    cylinder Mycylinder=new cylinder();
Mycylinder.setHieght(32);
Mycylinder.setRadius(54);
        System.out.println("Hieght of cylinder is :"+Mycylinder.getHieght());
        System.out.println("Radius of cylinder is :"+Mycylinder.getRadius());*/

//question 2 use ➊ to calculate surface and volume of the cylinder .
   /*     System.out.println("volume of cylinder is: "+Mycylinder.volume());
        System.out.println("surface Area of cylinder is: "+Mycylinder.surfaceArea());*/

        //question 3 create a class cylinder by using constructor set its radius and hieght.
       /* cylinder myNewCylinder=new cylinder(34,54);
        System.out.println("Area of cylinder is: "+myNewCylinder.surfaceArea());
        System.out.println("volume of cylinder is: "+myNewCylinder.volume());*/

//question 4 Overload a constructor used to initialize a rectangle of length 4 and breath 5 for using custom parameters ?
       /* System.out.println("________________________________________________");
          Rectangle Rec=new Rectangle();
          Rectangle Rec1=new Rectangle();*/

//question 5 use ➊ to calculate for sphere .
    /*        Sphere Sp=new Sphere();
        System.out.println("Area of sphere is: "+Sp.surfaceArea());
        System.out.println("Volume of sphere is: "+Sp.Volume());*/


    }

}
