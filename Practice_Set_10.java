package com.company;
class Circles{
    int radius;
    Circles(int r){
        System.out.println("i am circle constructor");
        this.radius=r;
    }
    public double Area_circle(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinders extends Circles{
    Cylinders(int r,int h){
        super(r);
        System.out.println("i am cylinder constructor");
        this.radius=r;
        this.hieght=h;
    }
    int hieght;
    public double Volume(){
       return Math.PI*this.radius*this.hieght*this.radius;
    }
}

class Rectangles_{
    int length;
    int breath;
    Rectangles_(int l,int b){
        this.length=l;
        this.breath=b;
    }
    public int Area(){
        return length*breath;
    }
}
class Cuboid_ extends Rectangles_{
    int hieght;
    Cuboid_(int l,int b, int h){
        super(l,b);
        this.length=l;
        this.breath=b;
        this.hieght=h;
    }
    public int volume(){
        return length*breath*hieght;
    }
}

public class Practice_Set_10 {
    public static void main(String[] args) {
        //question-1 create a class circle and inherit a class cylinder from it.
//       Circles cir=new Circles(7);
        Cylinders c = new Cylinders(7, 9);
        System.out.println(c.Volume());

    //Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible
    Rectangles_ r=new Rectangles_(3,4);
    Cuboid_ Cuboid=new Cuboid_(3,4,5);
        System.out.println(r.Area());
        System.out.println(Cuboid.volume());
    }
}
