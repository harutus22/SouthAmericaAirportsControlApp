package com.homework.CashDesk;

import com.homework.Airline.Plane;
import java.util.LinkedList;
import java.util.Random;

public class Ticket {

    private String serialNumber, seatNumber;
    private int price;

    public Ticket() {

    }

    public Ticket(int price, int seat) {
        ++seat;
        Random rand = new Random();
        this.serialNumber = "TK" + Math.abs(rand.nextInt());
        this.seatNumber = "Seat No" + seat;
        this.price = price;
    }

    public LinkedList<Ticket> prepareTickets(Plane plane, int price) {
        LinkedList<Ticket> ticket = new LinkedList<>();
        for (int i = 0; i < plane.getCapasity(); ++i) {
            ticket.add(new Ticket(price, i));
        }
        return ticket;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public int getPrice() {
        return price;
    }
}
