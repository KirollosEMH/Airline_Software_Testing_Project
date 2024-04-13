package org.example.airlines;

public class Reservation {
    private String reservationId;
    private String seatNumber;
    private String status;

    public Reservation() {
        this.reservationId = "";
        this.seatNumber = "";
        this.status = "";
    }

    public Reservation(String reservationId, String flightId, String userId, String seatNumber, String status) {
        this.reservationId = reservationId;
        this.seatNumber = seatNumber;
        this.status = status;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }


    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getStatus() {
        return status;
    }
}
