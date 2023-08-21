package com.company;

import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;

class Library_Management{

    static Scanner sc=new Scanner(System.in);
    HashSet<String> book=new HashSet<>(25);
    HashSet<String> book_Borrow=new HashSet<>(25);


    public  void addBook(){
        System.out.println("_________________________________________________");
        System.out.println("you want to add some new book");
        System.out.print("Enter book you want to add: ");
        String Book_to_Add=sc.nextLine();
        book.add(Book_to_Add);
        System.out.println("Book added successfully");
        System.out.println(Book_to_Add+" added on: "+LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh-mm-ss")));
        System.out.println("_________________________________________________");
    }

     public  void borrowBook(){

         System.out.println("_________________________________________________");
         System.out.println("you want to borrow some book: ");
         System.out.println("Enter book name to borrow: ");
         String Book_to_Borrow=sc.next();

         if(book.contains(Book_to_Borrow)){
             System.out.println(Book_to_Borrow+" has been issued on "+LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh-mm-ss")));
             book_Borrow.add(Book_to_Borrow);
             book.remove(Book_to_Borrow);
         }
         else {
             System.out.println("this book is not in our library: ");
         }

         System.out.println("_________________________________________________");
     }

    public void returnBorrowBooks(){

        System.out.println("_________________________________________________");
        System.out.println("Returning Borrowed book: ");
        String book_to_Return=sc.nextLine();

        if (book_Borrow.contains(book_to_Return)){
            System.out.println("Returning "+book_to_Return+" to library on "+LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh-mm-ss")));
            book.add(book_to_Return);
            book_Borrow.remove(book_to_Return);
        }
        else {
            System.out.println("This is not a valid book");
        }

        System.out.println("_________________________________________________");
    }

    public void displayBook(){
        System.out.println("_________________________________________________");
        System.out.println("Total number of books present in our library is: "+book.size());

        if (book.size()==0){
            System.out.println("no book is present in library ");
        }
        else {
            System.out.println("Displaying books: ");
            System.out.println(book);
        }

        System.out.println("____________________________________________________");
    }
    public void displayIssuedBook(){
        System.out.println("_________________________________________________");
        System.out.println("Total number of book issued by our library is: "+book_Borrow.size());

        if (book_Borrow.size()==0){
            System.out.println("No book has been issued by library");
        }
        else {
            System.out.println("Displaying issued books: ");
            System.out.println(book_Borrow);
        }

        System.out.println("____________________________________________________");
    }
}

public class Exercise_7_LibraryManagementSystem{
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("_________________________Library Management System_________________________");
        Library_Management UjjwalLibrary=new Library_Management();

        while (true){
            System.out.println("Press 1 for add new book\n2 for Borrow Books\n3 for return borrowed books\n4 for displaying current book present in library\n5 for displaying all book that has been issued by library\n6 for exiting the library: ");

            try{
            int what_You_want=sc.nextInt();

                if (what_You_want==1){
                    UjjwalLibrary.addBook();
                }

                else if(what_You_want==2){
                    UjjwalLibrary.borrowBook();
                }

                else if(what_You_want==3){
                    UjjwalLibrary.returnBorrowBooks();
                }

                else if(what_You_want==4){
                    UjjwalLibrary.displayBook();
                }

                else if(what_You_want==5){
                    UjjwalLibrary.displayIssuedBook();
                }

                else if(what_You_want==6){
                    System.out.println("Exiting the library");
                    break;
                }

                else {
                    System.out.println("Enter valid number 1,2,3,4");
                }

            }

            catch (InputMismatchException e){

                System.out.println("Enter valid Input");
                break;
            }
        }


    }
}
