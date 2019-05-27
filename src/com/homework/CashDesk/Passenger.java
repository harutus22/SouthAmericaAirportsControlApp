package com.homework.CashDesk;

import com.homework.Airline.Airline;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Passenger {

    private Map<String, Customer> passenger = new HashMap<>();

    public Passenger() {
    }

    public void buyingTicket(Ticket ticket, Customer customer) {
        passenger.put(ticket.getSerialNumber(), customer);
        Airline.income(ticket.getPrice());
    }

    public Customer getPassenger(Ticket ticket) {
        return passenger.get(ticket.getSerialNumber());
    }

    public void allPassengers(LinkedList<Ticket> ticket) {
        System.out.println("\nPassengers:");
        for (int i = 0; i < passenger.size(); ++i) {
            System.out.println(ticket.get(i).getSeatNumber() + "\n" +
                    passenger.get(ticket.get(i).getSerialNumber()).customerInfo());
        }
    }
}
