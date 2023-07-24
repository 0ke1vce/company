package com.company;

/**
 * This is a class which show how to add description in our javadoc
 */



public class JavaDocMethodsTag{
    /**
     *This is my main method
     *@param args "This is my arguments"
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * this is a method which can add two integers
     * @param a It's the first integer
     * @param b It's the second integer
     * @return Sum of two numbers as integer
     * @throws Exception when a is 0
//     * @deprecated  this method is deprecated please use + operator
     */
    public int add(int a,int b)throws Exception{
        if (a==0){
            throw new Exception();
        }
        int c=a+b;
        return c;
    }
}
