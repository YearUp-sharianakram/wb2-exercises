package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Please enter your name");
        String firstName = (promptForString("First name: ")).trim();
        String middleName = (promptForString("Middle name: ")).trim();
        String lastName = (promptForString("Last name: ")).trim();
        String suffix = (promptForString("Suffix: ")).trim();
        String fullName = firstName;
        if (!middleName.isEmpty()){
            fullName = fullName + " " + middleName;
        }
        fullName = fullName + " " + lastName;
        if (!suffix.isEmpty()){
            fullName = fullName + ", " + suffix;
        }
        System.out.println("Full Name: " + fullName);
        
    }

    public static String promptForString (String prompt){
        System.out.println(prompt);
        return myScanner.nextLine();
    }

//    public static

}
