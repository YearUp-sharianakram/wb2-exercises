package com.pluralsight;

import java.util.Scanner;

public class FullNameParseWithSplit {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args){
         String getName = (promptForString("Please enter your full name: ")).trim();
         String[] nameBreak = getName.split(" ");
         String firstName = nameBreak[0];
         String middleName;
         String lastName;
         if (nameBreak.length == 2){
             middleName = "(none)";
             lastName = nameBreak[1];
         }else{
             middleName = nameBreak[1];
             lastName = nameBreak[2];
         }
         System.out.println("First Name: " + firstName);
         System.out.println("Middle Name: " + middleName);
         System.out.println("Last Name: " + lastName);

    }

    public static String promptForString (String prompt){
        System.out.println(prompt);
        return myScanner.nextLine();
    }

}
