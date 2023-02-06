package com.kodilla.good.paterns.challenges.flight;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    private List<AirFlight> flights = new ArrayList<>();

    public FlightRepository(){

        flights.add(new AirFlight("Warszawa", "Gdańsk"));
        flights.add(new AirFlight("Wrocław", "Kraków"));
        flights.add(new AirFlight("Katowice", "Wiedeń"));
        flights.add(new AirFlight("Madryt", "Rzym"));
        flights.add(new AirFlight("Londyn", "Waszyngton"));
        flights.add(new AirFlight("Oslo", "Moskwa"));
        flights.add(new AirFlight("Tokio", "Pekin"));
        flights.add(new AirFlight("Sydney", "Cape Town"));
        flights.add(new AirFlight("Kair", "Valetta"));
        flights.add(new AirFlight("Barcelona", "Palermo"));

    }
    public List<AirFlight> getFlights(){
        return flights;
    }
}
