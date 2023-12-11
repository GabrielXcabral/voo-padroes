package main;

import model.Flight;
import model.Passenger;

public class FlightNotificationApp {
    public static void main(String[] args) {
        // Creating a flight
        Flight flight = new Flight("GLO2103", "JPA", "BSB", "12:00", "14:00");

        // Creating passengers
        Passenger passenger1 = new Passenger("John");
        Passenger passenger2 = new Passenger("Jane");

        // Adding passengers as observers to the flight
        flight.addObserver(passenger1);
        flight.addObserver(passenger2);

        // Simulating a status change
        flight.setStatus("Delayed");

        // Simulating a delay
        flight.setDelay("13:00", "15:00");
    }
}
