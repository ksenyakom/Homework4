package com.company;

public class Main {

    public static void main(String[] args) {
        Adress adress = new Adress("Минск", "Победителей", 1, 1);
        Customer man = new Customer("Вася", "Пупкин", 30, adress);
        Customer woman = new Customer("Катя", "Пупкина", 30, adress);
        Customer child = new Customer("Аполлон", "Пупкин", 5,adress);

//        System.out.println(man.getFullName() + ", " + man.age + " лет, " + man.getFullAdress() + ".");
//        System.out.println(woman.getFullName() + ", " + woman.age + " лет, " + woman.getFullAdress() + ".");
//        System.out.println(child.getFullName() + ", " + child.age + " лет, " + child.getFullAdress() + ".");

// создаем массив
        Customer[] array = new Customer[3];
        array[0] = man;
        array[1] = woman;
        array[2] = child;

        for (Customer cust:array) {
            System.out.println(cust.getFullName() + ", " + cust.age + " лет, " + cust.getFullAdress() + ".");
        }

        

    }
}
