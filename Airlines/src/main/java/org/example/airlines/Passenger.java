package org.example.airlines;

public class Passenger extends User {
    private String passportNumber;
    private Flight flight;
    private Reservation reservation;

    public Passenger() {
        super();
        this.passportNumber = "";
        this.flight = new Flight();
        this.reservation = new Reservation();
    }

    public Passenger(String name, String email, int age, String phone, String id, String passportNumber, Flight flight, Reservation reservation) {
        super(name, email, age, phone, id);
        this.passportNumber = passportNumber;
        this.flight = flight;
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
        System.out.println("Flight: " + flight);
        System.out.println("Reservation: " + reservation);
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void bookFlight() {
        System.out.println("Flight booked successfully!");
    }

    public void cancelFlight() {
        System.out.println("Flight cancelled successfully!");
    }

    public void updateFlight() {
        System.out.println("Flight updated successfully!");
    }

    public void viewFlight() {
        System.out.println("Flight viewed successfully!");
    }

    public void viewReservation() {
        System.out.println("Reservation viewed successfully!");
    }

    public void updateReservation() {
        System.out.println("Reservation updated successfully!");
    }

    public void cancelReservation() {
        System.out.println("Reservation cancelled successfully!");
    }

    public void checkFlightSchedule() {
        System.out.println("Flight schedule checked successfully!");
    }



}
