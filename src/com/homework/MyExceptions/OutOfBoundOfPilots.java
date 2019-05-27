package com.homework.MyExceptions;

import com.homework.Airline.Pilot;
import java.util.ArrayList;

public class OutOfBoundOfPilots extends ArrayIndexOutOfBoundsException {
    public OutOfBoundOfPilots(int number, ArrayList<Pilot> pilots) {
        super();
        message(number, pilots);
    }

    private void message(int number, ArrayList<Pilot> pilots) {
        System.out.println("There is no such pilot in " + number + " position, try pilots below "
                + pilots.size() + " position");
    }
}
