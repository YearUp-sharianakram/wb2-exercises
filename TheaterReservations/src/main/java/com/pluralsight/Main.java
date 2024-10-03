package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        String fullName = promptForString("Please enter your first and last name: ");
        String dateUserEntry = promptForString("What date will you be coming (MM/dd/yyyy)? ");
        int ticketAmount = promptForInt("How many tickets would you like? ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateUserEntry, formatter);
        String ticketWord = (ticketAmount == 1) ? "ticket" : "tickets";
        String[] names = fullName.split(" ");
        System.out.println(ticketAmount + " "  + ticketWord + " reserved for " + date + " under " + names[1] + ", " + names[0] );
    }

    public static String promptForString (String prompt){
        System.out.println(prompt);
        return myScanner.nextLine().trim();
    }
    public static int promptForInt(String prompt){
        System.out.println(prompt);
        int num = myScanner.nextInt();
        myScanner.nextLine();
        return num;
    }


}