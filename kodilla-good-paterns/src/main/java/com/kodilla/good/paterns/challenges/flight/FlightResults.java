package com.kodilla.good.paterns.challenges.flight;

import java.util.List;
import java.util.Map;

public class FlightResults {
    private List<Flight> flightList;

    public FlightResults(List<Flight> flightList){
        this.flightList = flightList;
    }
    public void showFlights(){
        flightList.stream().map(f->f.getArrival() + f.getArrival()).forEach(System.out::println);
    }
}
