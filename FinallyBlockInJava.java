package com.company;

public class FinallyBlockInJava {
    public static int greet(){
        try{
            int a=4;
            int b=0;
            int c=a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources..... End of function");
        }
        return -1;
    }
    public static void main(String[] args) {
        //Finally block contain the code which is always executed whether the exception is handeled or not.
        System.out.println(greet());
        System.out.println("______________________________");

        int a = 7;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }

        System.out.println("_____________________________");
        //try-finally block
        try{
            System.out.println((float)50/3);
        }
        finally {
            System.out.println("Yes this is finally");
        }
    }
}
