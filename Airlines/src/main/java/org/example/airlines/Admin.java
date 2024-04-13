package org.example.airlines;

public class Admin extends User {
    private  String password;
    private FlightSchedule flightSchedule;

    public Admin() {
     super();
    }
    public Admin(String name, String email, int age, String phone, String id, String password) {
        super(name, email, age, phone, id);
        this.password = password;
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin Name: " + getName());
        System.out.println("Admin Email: " + getEmail());
        System.out.println("Admin Age: " + getAge());
        System.out.println("Admin Phone: " + getPhone());
        System.out.println("Admin ID: " + getId());
        System.out.println("Admin Password: " + password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // add flights to the flight schedule
    public void addFlight(Flight flight) {
        flightSchedule.addFlight(flight);
        System.out.println("Flight added successfully!");
    }

    // remove flights from the flight schedule
    public void removeFlight(String flightId) {
        flightSchedule.removeFlight(flightId);
        System.out.println("Flight removed successfully!");
    }

    // modify flight price
    public void modifyFlightPrice(String flightId, String price) {
        flightSchedule.modifyFlightPrice(flightId, price);
        System.out.println("Flight price modified successfully!");
    }

    // modify flight status
    public void modifyFlightStatus(String flightId, String status) {
        flightSchedule.modifyFlightStatus(flightId, status);
        System.out.println("Flight status modified successfully!");
    }

    // modify flight duration
    public void modifyFlightDuration(String flightId, String duration) {
        flightSchedule.modifyFlightDuration(flightId, duration);
        System.out.println("Flight duration modified successfully!");
    }
    // display all flights

    public void displayFlights() {
        flightSchedule.displayFlights();
    }

    // modify flight departure time
    public void modifyFlightDepartureTime(String flightId, String departureTime) {
        flightSchedule.modifyFlightDepartureTime(flightId, departureTime);
        System.out.println("Flight departure time modified successfully!");
    }

    // modify flight arrival time
    public void modifyFlightArrivalTime(String flightId, String arrivalTime) {
        flightSchedule.modifyFlightArrivalTime(flightId, arrivalTime);
        System.out.println("Flight arrival time modified successfully!");
    }



}
