package org.example.airlines;

public class Flight {
    private String flightId;
    private String source;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String duration;
    private String price;
    private String status;
    private final int maxCapacity = 100;

    private int capacity = 0;


    public Flight() {
        this.flightId = "";
        this.source = "";
        this.destination = "";
        this.departureTime = "";
        this.arrivalTime = "";
        this.duration = "";
        this.price = "";
        this.status = "";
    }

    public Flight(String flightId, String source, String destination, String departureTime, String arrivalTime, String duration, String price, String status) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.duration = duration;
        this.price = price;
        this.status = status;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDuration() {
        return duration;
    }

    public String getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public boolean IncrementCapacity() {

        if (capacity < maxCapacity) {
            capacity++;
            return true;
        }
        capacity = maxCapacity;
        return false;
    }

    public  void DecrementCapacity() {
        capacity--;
    }


    public void displayInfo() {
        System.out.println("Flight ID: " + flightId);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Arrival Time: " + arrivalTime);
        System.out.println("Duration: " + duration);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
    }
}
