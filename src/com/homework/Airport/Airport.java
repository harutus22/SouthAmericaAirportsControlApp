package com.homework.Airport;

import com.homework.Airline.Airline;
import java.util.HashMap;
import java.util.Map;

public class Airport {

    private String airportName;
    private Map<String, Airline> airline = new HashMap<>();

    public Airport(String airportName) {
        this.airportName = airportName;
    }

    public Map<String, Airline> getAllAirlines() {
        return airline;
    }

    public Airline getAirline(String name) {
        return airline.get(name);
    }

    public void addAirline(String name) {
        airline.put(name, new Airline(name));
    }

    public String getAirportName() {
        return airportName;
    }
}
