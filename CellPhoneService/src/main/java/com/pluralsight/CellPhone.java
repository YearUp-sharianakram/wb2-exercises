package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String ownerName;

    public CellPhone(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.ownerName = "";
    }

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String ownerName){
        this.serialNumber =  serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.ownerName = ownerName;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getModel(){
        return model;
    }

    public String getCarrier(){
        return carrier;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getOwnerName(){
        return ownerName;
    }


    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier){
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public void dial(String callPhoneNumber){
        System.out.println(this.ownerName + "'s phone is calling " + callPhoneNumber);
    }

    public void dial(CellPhone callPhoneNumber){
        System.out.println(this.ownerName + "'s phone is calling " + callPhoneNumber.getPhoneNumber());
    }

}