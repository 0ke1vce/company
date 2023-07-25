package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime dT= LocalDateTime.now(); //this is date
        System.out.println(dT);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("E  dd/MM/yyyy");  //this is format here E stands for day of date
        String myDate=dT.format(df); //creating string using  date and format
        System.out.println(myDate); 

    }
}
