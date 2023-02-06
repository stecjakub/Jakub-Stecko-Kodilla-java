package com.kodilla.good.paterns.challenges.flight;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {
    private FlightRepository flightRepository;

    public FlightSearch(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }
    public List<Flight> airFlightsDestination (String Destination) {
        return flightRepository.getFlights().stream().filter(f->f.getDestination().equals(Destination)).collect(Collectors.toList());
    }
    public List<Flight> airFlightArrival (String Arrival) {
        return flightRepository.getFlights().stream().filter(f->f.getArrival().equals(Arrival)).collect(Collectors.toList());
    }
}
