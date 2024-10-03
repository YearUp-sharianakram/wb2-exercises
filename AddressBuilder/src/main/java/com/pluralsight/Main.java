package com.pluralsight;

import java.util.Scanner;

public class Main {
    static Scanner myScanner =new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder address = new StringBuilder();
        String fullName = promptForString("Full Name: ");
        address.append(fullName);
        String billingStreet = promptForString("Billing Street: ");
        String billingCity = promptForString("Billing City: ");
        String billingState = promptForString("Billing State: ");
        String billingZip = promptForString("Billing Zip: ");
        String shippingStreet = promptForString("Shipping Street: ");
        String shippingCity = promptForString("Shipping City: ");
        String shippingState = promptForString("Shipping State: ");
        String shippingZip = promptForString("Shipping Zip: ");
        address.append("\n\n");
        address.append("Billing Address:\n");
        address.append(billingStreet);
        address.append("\n");
        address.append(billingCity);
        address.append(", ");
        address.append(billingState);
        address.append(" ");
        address.append(billingZip);
        address.append("\n\n");
        address.append("Shipping Address:\n");
        address.append(shippingStreet);
        address.append("\n");
        address.append(shippingCity);
        address.append(", ");
        address.append(shippingState);
        address.append(" ");
        address.append(shippingZip);
        String finalAddress = address.toString();
        System.out.println(finalAddress);


    }

    public static void printBillingAddress(){
        String billingStreet = promptForString("Billing Street: ");
        String billingCity = promptForString("Billing City: ");
        String billingState = promptForString("Billing State: ");
        String billingZip = promptForString("Billing Zip: ");
        String lastLine = combineCityStateZip(billingCity,billingState,billingZip);
        System.out.println("Billing Address: ");
        System.out.println(billingStreet);
        System.out.println(lastLine);
    }

    public static void printShippingAddress(){
        String shippingStreet = promptForString("Shipping Street: ");
        String shippingCity = promptForString("Shipping City: ");
        String shippingState = promptForString("Shipping State: ");
        String shippingZip = promptForString("Shipping Zip: ");
        String lastLine = combineCityStateZip(shippingCity,shippingState,shippingZip);
        System.out.println("Shipping Address: ");
        System.out.println(shippingStreet);
        System.out.println(lastLine);
    }

    public static String combineCityStateZip(String city, String state, String zipCode){
        StringBuilder addressLine = new StringBuilder();
        addressLine.append(city);
        addressLine.append(", ");
        addressLine.append(state);
        addressLine.append(" ");
        addressLine.append(zipCode);
        return addressLine.toString();
    }

    public static String promptForString(String prompt){
        System.out.println(prompt);
        return myScanner.nextLine();
    }

}

