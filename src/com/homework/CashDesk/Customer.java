package com.homework.CashDesk;

import java.util.Random;

public class Customer {

    private final String name, surname, passportSerial;

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
        Random rand = new Random();
        this.passportSerial = "CM" + Math.abs(rand.nextInt());
    }

    public String customerInfo() {
        return "Name: " + name + "\nSurname: " + surname + "\nPassport Serial: " + passportSerial;
    }
}
