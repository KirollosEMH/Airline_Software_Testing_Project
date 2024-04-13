package org.example.airlines;

import java.util.Vector;

public class FlightSchedule {
    private Vector<Flight> flights;

    public FlightSchedule() {
        this.flights = new Vector<Flight>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void removeFlight(String flightId) {
        for (Flight flight : flights) {
            if (flight.getFlightId().equals(flightId)) {
                flights.remove(flight);
                break;
            }
        }
    }

    public Flight getFlight(String flightId) {
        for (Flight flight : flights) {
            if (flight.getFlightId().equals(flightId)) {
                return flight;
            }
        }
        return null;
    }

    // modify flight price
    public void modifyFlightPrice(String flightId, String price) {
        for (Flight flight : flights) {
            if (flight.getFlightId().equals(flightId)) {
                flight.setPrice(price);
                break;
            }
        }
    }

    // modify flight status

    public void modifyFlightStatus(String flightId, String status) {
        for (Flight flight : flights) {
            if (flight.getFlightId().equals(flightId)) {
                flight.setStatus(status);
                break;
            }
        }
    }

    // modify flight duration
    public void modifyFlightDuration(String flightId, String duration) {
        for (Flight flight : flights) {
            if (flight.getFlightId().equals(flightId)) {
                flight.setDuration(duration);
                break;
            }
        }
    }

    // modify flight arrival time
    public void modifyFlightArrivalTime(String flightId, String arrivalTime) {
        for (Flight flight : flights) {
            if (flight.getFlightId().equals(flightId)) {
                flight.setArrivalTime(arrivalTime);
                break;
            }
        }
    }

    // modify flight departure time
    public void modifyFlightDepartureTime(String flightId, String departureTime) {
        for (Flight flight : flights) {
            if (flight.getFlightId().equals(flightId)) {
                flight.setDepartureTime(departureTime);
                break;
            }
        }
    }


    public void displayFlights() {
        for (Flight flight : flights) {
            flight.displayInfo();
        }
    }
    public Flight searchFlight(String flightId) {
        for (Flight flight : flights) {
            if (flight.getFlightId().equals(flightId)) {
                flight.displayInfo();
                return flight;
            }
        }
        return null;
    }
    public Flight searchFlight(String source, String destination) {
        for (Flight flight : flights) {
            if (flight.getSource().equals(source) && flight.getDestination().equals(destination)) {
                flight.displayInfo();
                return flight;
            }
        }
        return null;
    }


}
