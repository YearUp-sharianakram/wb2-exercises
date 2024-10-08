package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();
//        CellPhone phone2 = new CellPhone();
        promptForCellPhone(phone1);
//        promptForCellPhone(phone2);
        display(phone1);
//        display(phone2);
//        phone1.dial(phone2.getPhoneNumber());
//        phone2.dial(phone1.getPhoneNumber());

        CellPhone phone3  = new CellPhone(33333, "iphone","T-mobile","333-333-3333","Karen");
        display(phone3);

        phone3.dial(phone1);



    }

    public static void promptForCellPhone(CellPhone phone){
        System.out.println("This is a new phone");
        int serialNumber = Console.PromptForInt("Please enter Serial Number:");
        phone.setSerialNumber(serialNumber);
        String model = Console.PromptForString("Please enter your phone model: ");
        phone.setModel(model);
        String carrier = Console.PromptForString("Please enter your carrier: ");
        phone.setCarrier(carrier);
        String phoneNumber = Console.PromptForString("Please enter your phone number: ");
        phone.setPhoneNumber(phoneNumber);
        String ownerName = Console.PromptForString("Please enter your name: ");
        phone.setOwnerName(ownerName);
    }

    public static void display(CellPhone phone){
        System.out.println(phone.getSerialNumber() + " " + phone.getModel() + " " + phone.getCarrier()+ " "  + phone.getPhoneNumber() + " " + phone.getOwnerName());

    }

}