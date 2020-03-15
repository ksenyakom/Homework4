package com.company;

public class Customer {
    String name;
    String surname;
    int age;
    Adress adress;
//    String city;
//    String street;
//    int houseNumber;
//    int flatNumber;

    public Customer() {

    }

    public Customer(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

//    public Customer(String name, String surname, int age, String city, String street, int houseNumber, int flatNumber) {
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//        this.city = city;
//        this.street = street;
//        this.houseNumber = houseNumber;
//        this.flatNumber = flatNumber;


    public Customer(String name, String surname, int age, Adress adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;

    }

    public String getFullName() {
        String name = this.name + " " + this.surname;
        return name;
    }
//    public String getFullAdress() {
//        String adress = "г."+this.city+", ул."+this.street + " " + this.houseNumber + "-" + this.flatNumber;
//        return adress;
//    }
    public String getFullAdress() {
        String adress = "г." + this.adress.city + ", ул." + this.adress.street + " " + this.adress.houseNumber + "-" + this.adress.flatNumber;
        return adress;
    }
}
