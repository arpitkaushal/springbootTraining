package com.sbtrain.assgn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue
    public int bookingId;

    public int flightId;
    public int numberOfSeats;
    public String customerId;
    public String status;

    public Booking() {
    }

    public Booking(int flightId, int numberOfSeats, String customerId) {
        this.flightId = flightId;
        this.numberOfSeats = numberOfSeats;
        this.customerId = customerId;
    }

    public Booking(int flightId, int numberOfSeats, String customerId, String status) {
        this.flightId = flightId;
        this.numberOfSeats = numberOfSeats;
        this.customerId = customerId;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Booking [id=" + bookingId + ", flightId=" + flightId + ", numberOfSeats=" + numberOfSeats
                + ", customer="
                + customerId + "]";
    }

}