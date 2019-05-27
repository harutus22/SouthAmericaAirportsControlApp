package com.homework.Flight;

import com.homework.Airline.Plane;
import com.homework.CashDesk.Customer;
import com.homework.CashDesk.Passenger;
import com.homework.CashDesk.Ticket;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Flight {

    private String departingPlace, arrivingPlace, departingTime, arrivingTime, flightNumber;
    private Plane plane;
    private Passenger passenger = new Passenger();
    private Ticket ticket = new Ticket();
    private LinkedList<Ticket> keyTicket;

    public Flight(String departingPlace, String arrivingPlace,
                  String departingTime, String arrivingTime, Plane plane) {
        this.departingPlace = departingPlace;
        this.arrivingPlace = arrivingPlace;
        this.departingTime = departingTime;
        this.arrivingTime = arrivingTime;
        this.plane = plane;
        Random rand = new Random();
        this.flightNumber = "FLG" + Math.abs(rand.nextInt());
    }

    public void flightInf() {
        System.out.println("Departing From: " + departingPlace + "\nArriving To: " + arrivingPlace +
                "\nDeparting Time: " + departingTime + "\nArriving Time: " + arrivingTime + "\nPlane Model: "
                + plane.getPlaneModel() + "\nPlane Number: " + plane.getPlaneNumber() + "\nFlight Number: "
                + flightNumber);
    }

    public Plane getPlane() {
        return plane;
    }

    public LinkedList<Ticket> getKeyTicket() {
        return keyTicket;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void ticketForFlight(ArrayList<Customer> customers) {
        keyTicket = ticket.prepareTickets(plane, 500);
        for (int i = 0; i < keyTicket.size() || i < customers.size(); ++i) {
            passenger.buyingTicket(keyTicket.get(i), customers.get(i));
        }
    }
}
