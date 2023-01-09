package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFind{
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airPortsList = new HashMap<>();
        airPortsList.put("Tokio", true);
        airPortsList.put("Warsaw", true);
        airPortsList.put("Moscow", false);
        airPortsList.put("Paris", true);
        airPortsList.put("New York", true);

        if(airPortsList.get(flight.getArrivalAirport()) == false){
            throw new RouteNotFoundException();
        }
    }
}
