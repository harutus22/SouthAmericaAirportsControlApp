package com.homework;

import com.homework.Airport.Airport;
import com.homework.CashDesk.Customer;
import com.homework.Flight.Flight;
import com.homework.MyExceptions.OutOfBoundOfPilots;
import com.homework.MyExceptions.OutOfPilot;
import com.homework.MyExceptions.OutOfPlane;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Airport airport = new Airport("Glasgow");
        airport.addAirline("Phoenix");
        airport.addAirline("Honey");
        airport.getAirline("Phoenix").setPilots("John", "Frusciante");
        airport.getAirline("Phoenix").setPilots("Christopher", "Lambert");
        airport.getAirline("Phoenix").setPilots("Garry", "Cooper");
        airport.getAirline("Phoenix").setStaffMember("Vladislav", "Cepesh");
        airport.getAirline("Phoenix").setStaffMember("Iriko", "Kenoyashi");
        airport.getAirline("Phoenix").setStaffMember("Hastrubal", "Barka");
        airport.getAirline("Phoenix").setStaffMember("Jenifer", "MacClagey");
        airport.getAirline("Phoenix").setStaffMember("Samantha", "Smakchin");
        try {
            airport.getAirline("Phoenix").setPlanes("A336", 5,
                    airport.getAirline("Phoenix").getFreePilot());
            Flight flight = new Flight(airport.getAirportName(), "Stansberry",
                    "19:00", "22:00", airport.getAirline("Phoenix").getFreePlane());
            flight.flightInf();
            ArrayList<Customer> customers = new ArrayList<>();
            customers.add(new Customer("John", "Petrucci"));
            customers.add(new Customer("Wilhelm", "Lester"));
            customers.add(new Customer("Tommy", "Angelo"));
            customers.add(new Customer("Steven", "Lawking"));
            customers.add(new Customer("Jacob", "Johnson"));
            flight.ticketForFlight(customers);
            flight.getPassenger().allPassengers(flight.getKeyTicket());
        } catch (OutOfPlane e) {
            System.out.println("Can not create new Flight, because all planes are occupied");
        } catch (OutOfPilot e) {
            System.out.println("Can not create new Flight, because all pilots are occupied");
        } catch (OutOfBoundOfPilots a) {
        }
    }
}
