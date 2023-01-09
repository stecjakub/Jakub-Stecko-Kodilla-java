package com.kodilla.exception.test;

public class FlightFindRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Paris","Moscow");
        FlightFind flightFind = new FlightFind();
        try{
            flightFind.findFlight(flight);
        }catch(RouteNotFoundException e ){
            System.out.println("Flight doesn't exist" + e);

        }
    }
}
