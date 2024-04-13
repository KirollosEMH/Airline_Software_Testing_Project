package org.example.airlines;

public class Reservation {
    private String reservationId;
    private String flightId;
    private String userId;
    private String seatNumber;
    private String status;

    public Reservation() {
        this.reservationId = "";
        this.flightId = "";
        this.userId = "";
        this.seatNumber = "";
        this.status = "";
    }

    public Reservation(String reservationId, String flightId, String userId, String seatNumber, String status) {
        this.reservationId = reservationId;
        this.flightId = flightId;
        this.userId = userId;
        this.seatNumber = seatNumber;
        this.status = status;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getUserId() {
        return userId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getStatus() {
        return status;
    }
}
