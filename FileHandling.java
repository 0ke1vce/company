package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        //Code to create a new file
    /*  .
        File MyFile=new File("fileHandling.txt");
        try {
            MyFile.createNewFile();
        }
        catch (Exception e) {
            System.out.println("unable to create file");
            throw new RuntimeException(e);
        }
     */

        //Code to write to a file
     /*  .
        try {
            FileWriter MyFile = new FileWriter("fileHandling.txt");
            MyFile.write("this is the first line from this java course\nOk now bye");
            MyFile.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
*/

        //Reading a file
   /* .
        File myFile=new File("fileHandling.txt");
        try  {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){    // <------returns true if and only if this scanner has another line of input
                String line =sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    */

        //Deleting a File
     /*  .
        File myFile=new File("fileHandling.txt");

        if (myFile.delete()){
            System.out.println("I have deleted "+myFile.getName());
        }
        else {
            System.out.println("file can't be deleted");
        }
*/

    }
}
