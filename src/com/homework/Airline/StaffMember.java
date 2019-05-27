package com.homework.Airline;

import java.util.Random;

public class StaffMember {

    private final String name, surname, staffLicenseNumber;
    private boolean availability = true;

    public StaffMember(String name, String surname) {
        this.name = name;
        this.surname = surname;
        Random rand = new Random();
        this.staffLicenseNumber = "STF" + Math.abs(rand.nextInt());
    }

    public String getStaffMember() {
        return name + " " + surname + " " + staffLicenseNumber;
    }
}
