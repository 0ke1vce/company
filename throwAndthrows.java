package com.company;
class NegativeRadius extends Exception{
    public String  toString(){
        return "radius can't be negative!";
    }
    public String getMessage(){
        return "Radius connot be negative";
    }
}
public class throwAndthrows {
    public static double Area(int radius) throws NegativeRadius{
        if (radius<0){
            throw new NegativeRadius();
        }
        else {
        return Math.PI*radius*radius;}
    }


    //Made by ujjwal->
   static float divide(int a,int b) {
       return (float)a/b;
   }
    public static void main(String[] args) {
        System.out.println("___________________________________________");
      //Rakesh uses this function made by ujjjwal
        try {
            float c=divide(6,0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Exception!");
        }

        System.out.println("________________________________________");

        try {
            System.out.println(Area(4));
        }
        catch (Exception e) {
            System.out.println(e);;
        }
    }
}
