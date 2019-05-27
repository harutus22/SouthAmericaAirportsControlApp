package com.homework.Airline;

import java.util.Random;

public class Plane {

    private final String planeNumber, planeModel;
    private final int capacity;
    private boolean availability = true;
    private Pilot pilot;

    public Plane(String planeModel, int capacity, Pilot pilot) {
        Random rand = new Random();
        this.planeNumber = "PLN" + Math.abs(rand.nextInt());
        this.planeModel = planeModel;
        this.capacity = capacity;
        this.pilot = pilot;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public String getPlaneModel() {
        return planeModel;
    }

    public int getCapasity() {
        return capacity;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public boolean getAvailability() {
        if (availability) {
            availability = false;
            return true;
        }
        return false;
    }
}
