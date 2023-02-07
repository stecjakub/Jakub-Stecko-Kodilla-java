package com.kodilla.good.paterns.challenges;

import com.kodilla.good.paterns.challenges.flight.FlightRepository;
import com.kodilla.good.paterns.challenges.flight.FlightResults;
import com.kodilla.good.paterns.challenges.flight.FlightSearch;

public class FlightRunner {
    public static void main(String[] args){
        FlightRepository flightRepository = new FlightRepository();
        FlightSearch flightSearch = new FlightSearch(flightRepository);

        FlightResults flightResults1 = new FlightResults(flightSearch.airFlightArrival("Gdańsk"));
        FlightResults flightResults2 = new FlightResults(flightSearch.airFlightsDestination("Kair"));
        FlightResults flightResults3 = new FlightResults(flightSearch.airFlightWithChange("Warszawa","Oslo","Gdańsk"));

        flightResults1.showFlights();
        System.out.println();
        flightResults2.showFlights();
        flightResults3.showFlights();
    }
}
