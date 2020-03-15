package com.company;

public class Adress {
    String city;
    String street;
    int houseNumber;
    int flatNumber;

    public Adress() {

    }

    public Adress(String city, String street, int houseNumber, int flatNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    public String getFullAdress() {
        String fullAdress = "г." + this.city + ", ул." + this.street + " " + this.houseNumber + "-" + this.flatNumber;
        return fullAdress;
    }
}
