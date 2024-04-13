package org.example.airlines;

public class Passenger extends User {
    private String passportNumber;
    private FlightSchedule flightSchedule = new FlightSchedule();

    private Flight flight;
    private Reservation reservation = new Reservation();

    public Passenger() {
        super();
        this.passportNumber = "";
        this.reservation = new Reservation();
    }

    public Passenger(String name, String email, int age, String phone, String id, String passportNumber, Reservation reservation) {
        super(name, email, age, phone, id);
        this.passportNumber = passportNumber;
        this.reservation = reservation;
    }

    @Override
    public void displayInfo() {
        System.out.println("Passenger Name: " + getName());
        System.out.println("Passenger Email: " + getEmail());
        System.out.println("Passenger Age: " + getAge());
        System.out.println("Passenger Phone: " + getPhone());
        System.out.println("Passenger ID: " + getId());
        System.out.println("Passport Number: " + passportNumber);
        reservation.displayInfo();
        flight.displayInfo();

    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }


    public String getPassportNumber() {
        return passportNumber;
    }




    public void bookFlight(String flightId) {
        this.flight = flightSchedule.searchFlight(flightId);
        System.out.println("Flight booked successfully!");
        reservation.setStatus("Booked");
    }

    public void cancelFlight() {
        System.out.println("Flight cancelled successfully!");
        flight = null;
        reservation.setStatus("Cancelled");
    }

    public void updateFlight(String flightId){
        System.out.println("Flight updated successfully!");
        bookFlight(flightId);
    }

    public void viewFlight(String FlightId) {
        Flight tmp = flightSchedule.searchFlight(FlightId);
        tmp.displayInfo();
        System.out.println("Flight viewed successfully!");
        tmp = null;
    }
    public void setClass(String flightClass) {
        reservation.setFlightClass(flightClass);
    }

    public void checkFlightSchedule() {
        flightSchedule.displayFlights();
        System.out.println("Flight schedule checked successfully!");
    }



}
