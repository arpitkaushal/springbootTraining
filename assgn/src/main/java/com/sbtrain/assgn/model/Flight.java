package com.sbtrain.assgn.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue
    public int id;

    public String airline;

    public LocalDateTime departureTime;
    public LocalDateTime arrivalTime;

    public String departureCity;
    public String arrivalCity;

    public int availableSeats;

    public Flight(String airline, LocalDateTime departureTime, LocalDateTime arrivalTime, String departureCity,
            String arrivalCity, int availableSeats) {
        this.airline = airline;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.availableSeats = availableSeats;
    }

    public Flight() {
    }

    @Override
    public String toString() {
        return "Flight [id=" + id + ", airline=" + airline + ", departureTime=" + departureTime + ", arrivalTime="
                + arrivalTime + ", departureCity=" + departureCity + ", arrivalCity=" + arrivalCity
                + ", availableSeats=" + availableSeats + "]";
    }

}
