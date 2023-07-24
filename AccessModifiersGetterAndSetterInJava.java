package com.company;

import javax.swing.*;
import java.util.Scanner;

class MyEmployee{
 private    int id;
   private String name;
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

class Circle_area_perimeter{
    private int radius;
    private float area=radius*radius*3.14f;
    private float perimeter=2*3.14f*radius;
   public void setArea(float A){
       if (A==area){
           System.out.println("area is same ");
           area=A;}
       else {
               System.out.println("Area is not same according to setted area");
               area=A;}
       }

   public void setRadius(int r){
       radius=r;
   }
   public void setPerimeter(float P){
       if(P==perimeter){
           System.out.println("perimeter is same ");
           perimeter=P;
       }
       else {
           System.out.println("perimeter is not same according to setted perimeter");
           perimeter=P;
       }
   }
    public int getRadius() {

        return radius;
    }
    public float getArea() {
        return area;
    }
    public float getPerimeter() {
        return perimeter;
    }

}

public class AccessModifiersGetterAndSetterInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MyEmployee ujjwal=new MyEmployee();
//        ujjwal.id=1;         -->    In case of  Private access modifier throws an error
//        ujjwal.name="Ujjwal";
ujjwal.setName("Ujjwal");
ujjwal.setId(1);
        System.out.println(ujjwal.getName()+"and id is "+ ujjwal.getId());


        Circle_area_perimeter Circle_Area_And_Perimeter=new Circle_area_perimeter();
        int x=sc.nextInt();
        Circle_Area_And_Perimeter.setRadius(x);
        System.out.println("Radius is: "+Circle_Area_And_Perimeter.getRadius());
        float y=sc.nextFloat();
        Circle_Area_And_Perimeter.setArea(y);
        System.out.println(Circle_Area_And_Perimeter.getArea());
        float z=sc.nextFloat();
        Circle_Area_And_Perimeter.setPerimeter(z);
        System.out.println(Circle_Area_And_Perimeter.getPerimeter());


    }
}


//access modifiers specifies where a property or method is accessible
/* 4types of access modifiers
            1-Private
            2-Default
            3-Protected
            4-Public

 */