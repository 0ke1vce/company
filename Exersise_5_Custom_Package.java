package com.ujjwal.shape;
/*
 * You have to create a package named com.ujjwal.shape
 * This package should have individual classes for Rectangle,Cuboid
 * These classes should use inheritance to properly manage the code!
 * Include methods like volume, surface area and getters/setters for dimensions
 */

class Rectangle1{
    int length;
    int breath;

    public void setlength(int length){
        this.length=length;
    }
    public int getlength(){
        return length;
    }
    public void setbreath(int breath){
        this.breath=breath;
    }
    public int getbreath(){
        return breath;
    }

    public void SurfaceArea(){
        System.out.println(length*breath);}}


class Cuboid1 extends Rectangle1{
    private int hieght;
    public void sethieght(int hieght){
        this.hieght=hieght;
    }
    public int gethieght(){
        return hieght;
    }


    public void SurfaceArea(){
        System.out.println(2*(length*breath+breath*hieght+hieght*length));}

    public void volume(){
        System.out.println(length*breath*hieght);
    }

}

public class Exersise_5_Custom_Package{
    public static void main(String []args){
        System.out.println("Hello");

        Rectangle1 rec=new Rectangle1();
        rec.setlength(5);

        rec.setbreath(7);

        rec.SurfaceArea();

        Cuboid1 cu=new Cuboid1();
        cu.setlength(5);

        cu.setbreath(7);

        cu.sethieght(9);

        cu.SurfaceArea();
        cu.volume();



    }
}