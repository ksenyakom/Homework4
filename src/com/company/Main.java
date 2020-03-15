package com.company;

import SeparatePackege.*;

public class Main {

    public static void main(String[] args) {
        Address address = new Address("Минск", "Победителей", 1, 1);
        Address address1 = new Address("Минск", "Победителей", 5);
        Customer man = new Customer("Вася", "Пупкин", 33, address);
        Customer woman = new Customer("Катя", "Пупкина", 30, address1);
        Customer child = new Customer("Аполлон", "Пупкин", 1, address);


        // создаем массив
        Customer[] array = new Customer[3];
        array[0] = man;
        array[1] = woman;
        array[2] = child;

        for (Customer cust : array) {
            System.out.println(cust.getFullName() + ", " + cust.getAge() +", "+ cust.getFullAddress() + ".");
        }
    }
}
