package com.company;
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("_______________________________");
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
        System.out.println("my salary is: "+salary);
        System.out.println("_______________________________");
    }

    public int getSalary(){
        return salary;
    }
}

public class CreatingOurOwnJavaClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee ujjwal = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for ujjwal
        ujjwal.id = 12;
        ujjwal.salary = 34;
        ujjwal.name = "ke1vce";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "John Khandelwal";

        // Printing the Attributes
        ujjwal.printDetails();
        john.printDetails();

        int y= john.salary;   //to print john salary
        System.out.println(y);
        // System.out.println(ujjwal.id);   //enki jagah method bana diya
        // System.out.println(ujjwal.name);
    }
}
