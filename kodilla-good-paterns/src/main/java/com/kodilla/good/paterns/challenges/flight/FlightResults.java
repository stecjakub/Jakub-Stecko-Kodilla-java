package com.kodilla.good.paterns.challenges.flight;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class FlightResults {
    private List<Flight> flightList;

    public FlightResults(List<Flight> flightList){
        this.flightList = flightList;
    }
    public void showFlights(){
        flightList.stream().map(f->f.getArrival() + " - " + f.getDestination()).forEach(System.out::println);

    }
}
