package com.kodilla.good.paterns.challenges.flight;

import java.util.Objects;

public class AirFlight implements Flight{
    private String destination;
    private String arrival;

    public AirFlight(String destination, String arrival) {
        this.destination = destination;
        this.arrival = arrival;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirFlight airFlight = (AirFlight) o;
        return Objects.equals(destination, airFlight.destination) && Objects.equals(arrival, airFlight.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, arrival);
    }
}
