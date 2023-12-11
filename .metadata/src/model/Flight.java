package model;
import java.util.ArrayList;
import java.util.List;

import interfaces.Observer;
import interfaces.Subject;

public class Flight implements Subject {
    private String flightCode;
    private String status;
    private String departureAirport;
    private String destinationAirport;
    private String departureTime;
    private String arrivalTime;
    private List<Observer> observers = new ArrayList<>();

    public Flight(String flightCode, String departureAirport, String destinationAirport, String departureTime, String arrivalTime) {
        this.flightCode = flightCode;
        this.status = "Scheduled";
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers("Flight status changed to " + status);
    }

    public void setDelay(String newDepartureTime, String newArrivalTime) {
        this.departureTime = newDepartureTime;
        this.arrivalTime = newArrivalTime;
        notifyObservers("Flight delayed. New departure time: " + newDepartureTime + ", New arrival time: " + newArrivalTime);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public String getFlightCode() {
        return flightCode;
    }

    public String getStatus() {
        return status;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public void addObserver(Observer observer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addObserver'");
    }

    @Override
    public void removeObserver(Observer observer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeObserver'");
    }
}