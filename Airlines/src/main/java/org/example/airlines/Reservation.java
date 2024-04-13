package org.example.airlines;

public class Reservation {
    private int reservationId;
    private String flightClass;
    private String status;

    private static int reservationCounter = 1;
    public Reservation() {
        this.reservationId = reservationCounter++;
        this.flightClass = "";
        this.status = "";
    }

    public Reservation(int reservationId, String flightId, String userId, String seatNumber, String status) {
        this.reservationId = reservationId;
        this.flightClass = seatNumber;
        this.status = status;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public String getStatus() {
        return status;
    }
    void displayInfo() {
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Flight Class: " + flightClass);
    }

}
