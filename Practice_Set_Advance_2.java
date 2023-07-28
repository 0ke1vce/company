package com.company;

//____________________________________
/* .     class  deprecated_ujjwal{
    @Deprecated
    public void meth1(){
        System.out.println("meth1");
    }
}*/
//________________________________________


/*. class  deprecated_ujjwal{
    @Deprecated
    public void meth1(){
        System.out.println("meth1");
    }
} */
//________________________________________


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practice_Set_Advance_2 {
    public static void main(String[] args) {
//        @SuppressWarnings("depreciation")
//__________________________________________
//        Question 1: Create a class and a method with deprecated annotation. What is its effect on program execution?
   /* .    deprecated_ujjwal duj=new deprecated_ujjwal();
        duj.meth1();*/
        //There is no as such special effect on the program of deprecated annotation.
        // The only thing is that compiler generated a waning if we use deprecated method or class in our progr
//__________________________________________

//Question 2: Suppress the warning generated in question number 2
       /*. deprecated_ujjwal duj=new deprecated_ujjwal();
        duj.meth1();
*/
//__________________________________________

//Question 4: Write a Java program to generate a multiplication table of a given number and write it to a file
    /* .


    //Creating the FIle
        myFile=new File("tableOfN.txt");
        Scanner sc=new Scanner(System.in);
        try{
            myFile.createNewFile();
        }
        catch (IOException e){
            e.printStackTrace();
        }

      //Write into file

        try {
            System.out.println("enter number to create table");
            int n= sc.nextInt();
            FileWriter fileWriter=new FileWriter("tableOfN.txt");
            for (int i=1;i<11;i++){
                fileWriter.write(n+"X"+i+"="+n*i+"\n");
            }
            fileWriter.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


       //To read my file
        try  {
            Scanner x = new Scanner(myFile);
            while (x.hasNextLine()){
                String line =x.nextLine();
                System.out.println(line);
            }
            x.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
*/
//_________________________________________________________

        //Question 5: Write a Java program to generate a multiplication  TABLE OF 2 TO 9 and write it to a file

/* .
        for (int i=2;i<10;i++){

            File myFile=new File("C:\\Users\\patni\\Java tutorial\\java\\Introduction to java\\src\\com\\company\\tables\\table_of"+i+"_.txt");
            try {
                myFile.createNewFile();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        for (int k=2;k<10;k++) {
            try {
                FileWriter fwr = new FileWriter("C:\\Users\\patni\\Java tutorial\\java\\Introduction to java\\src\\com\\company\\tables\\table_of" + k + "_.txt");
                fwr.write("table of: "+k);
                for(int j=1;j<11;j++){
                    fwr.write(k+"X"+j+"="+k*j);

                }
            }
            catch (IOException e){
                e.printStackTrace();
            }

        }
 */
    }
}
