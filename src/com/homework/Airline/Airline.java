package com.homework.Airline;

import com.homework.Flight.Flight;
import com.homework.MyExceptions.OutOfBoundOfPilots;
import com.homework.MyExceptions.OutOfPilot;
import com.homework.MyExceptions.OutOfPlane;
import java.util.ArrayList;

public class Airline {

    private String airlineName;
    private ArrayList<Pilot> pilots = new ArrayList<>();
    private ArrayList<Plane> planes = new ArrayList<>();
    private ArrayList<StaffMember> staffMember = new ArrayList<>();
    private ArrayList<Flight> flight = new ArrayList<>();
    private static int income;

    public Airline(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public Pilot getPilot(int number) throws OutOfBoundOfPilots {
        if (number > pilots.size()) {
            throw new OutOfBoundOfPilots(number, pilots);
        }
        return pilots.get(number);
    }

    public void setPilots(String name, String surname) {
        this.pilots.add(new Pilot(name, surname));
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(String planeModel, int capacity, Pilot pilot) {
        this.planes.add(new Plane(planeModel, capacity, pilot));
    }

    public ArrayList<StaffMember> getStaffMember() {
        return staffMember;
    }

    public void setStaffMember(String name, String surname) {
        this.staffMember.add(new StaffMember(name, surname));
    }

    public ArrayList<Flight> getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight.add(flight);
    }

    public Pilot getFreePilot() throws OutOfPilot {
        for (Pilot pilot : pilots) {
            if (pilot.getAvailability()) {
                return pilot;
            }
        }
        throw new OutOfPilot();
    }

    public Plane getFreePlane() throws OutOfPlane {
        for (Plane plane : planes) {
            if (plane.getAvailability()) {
                return plane;
            }
        }
        throw new OutOfPlane();
    }

    public static void income(int money) {
        income += money;
    }

    public static int getIncome() {
        return income;
    }
}
