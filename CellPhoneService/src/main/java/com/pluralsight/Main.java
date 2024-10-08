package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();
        int serialNumber = Console.PromptForInt("Please enter Serial Number: ");
        phone1.setSerialNumber(serialNumber);
        String model = Console.PromptForString("Please enter your phone model: ");
        phone1.setModel(model);
        String carrier = Console.PromptForString("Please enter your carrier: ");
        phone1.setCarrier(carrier);
        String phoneNumber = Console.PromptForString("Please enter your phone number: ");
        phone1.setPhoneNumber(phoneNumber);
        String ownerName = Console.PromptForString("Please enter your name: ");
        phone1.setOwnerName(ownerName);

        System.out.println(phone1.getSerialNumber() + " " + phone1.getModel() + " " + phone1.getCarrier()+ " "  + phone1.getPhoneNumber() + " " + phone1.getOwnerName());



    }

}