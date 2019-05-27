package com.homework.Airline;

import java.util.Random;

public class Pilot {

    private final String name, surname, licensNumber;
    private boolean availability = true;

    public Pilot(String name, String surname) {
        this.name = name;
        this.surname = surname;
        Random rand = new Random();
        this.licensNumber = "PIL" + Math.abs(rand.nextInt());
    }

    public String getPilot() {
        return name + " " + surname + " LN: " + licensNumber;
    }

    public boolean getAvailability() {
        if (availability) {
            availability = false;
            return true;
        }
        return false;
    }
}
