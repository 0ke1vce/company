//Make a password manager system which can save your password in a separate file passManager.txt.
package com.company;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class  PassManager{
    Scanner sc=new Scanner(System.in);
PassManager(){
    System.out.println("Welcome to my PasswordManagement Program ");
}
public  void CreateFileTOSavePassword(){
    System.out.println("Creating the File: ");
    File MyFile=new File("savePass.txt");
    try {
        System.out.println("........");
        MyFile.createNewFile();
        System.out.println("File Created -_-");
    }
    catch (Exception e){
        System.out.println("File can't be created ");
    }
}
public void SavePAss(){
    System.out.println("you want to save your password: ");
    try {
        FileWriter Fwrite=new FileWriter("passSave.txt");
        System.out.println("Write password to save: ");
        String SavePassword=sc.nextLine();
        Fwrite.append(SavePassword+"\n");
        Fwrite.close();
        System.out.println("Password Saved successfully");
    }
    catch (Exception e){
        System.out.println("File can't be Written ");
    }
}
public void ReadPassword(){
    System.out.println("OHH So you want to read Passwords: ");
    File myFile=new File("passSave.txt");
    try {
        Scanner ReadSavePass=new Scanner(myFile);
        while (ReadSavePass.hasNextLine()){
            String line=ReadSavePass.nextLine();
            System.out.println(line);
        }
        System.out.println("All password has been showed");
    }
    catch (Exception e){
        System.out.println("Password can;t be viewed  ");
    }
}
public  void DeleteAllPAssword(){
    File myFile=new File("passSave.txt");
    try {
        System.out.println("File is deleting......");
        myFile.delete();
        System.out.println("File HAs been deleted::::  ");
    }
    catch (Exception e){
        System.out.println("password can't be deleted ");
    }
}

}

public class PasswordManager {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
PassManager UjjwalPAssword=new PassManager();
while (true){
    System.out.println("Press\n1-Creating File\n2-Saving Password\n3-Reading Password\n4-Deleting File\n5-Exiting the Application ");
  try {
      Byte choose=s.nextByte();
      switch (choose) {
          case 1:
              UjjwalPAssword.CreateFileTOSavePassword();
              break;
          case 2:
              UjjwalPAssword.SavePAss();
              break;
          case 3:
              UjjwalPAssword.ReadPassword();
              break;
          case 4:
              UjjwalPAssword.DeleteAllPAssword();
              break;
          case 5:
              System.out.println("Exiting the program");
              break;
          default:
              System.out.println("Enter a valid Number 1,2,3,4,5 ");
              break;

      }
  if (choose==5){
      break;
  }
  }
  catch (Exception e){
      System.out.println("Emter a Byte character -128 to 128");
  }
}

    }
}
