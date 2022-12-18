package com.sbtrain.assgn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbtrain.assgn.model.Booking;
import com.sbtrain.assgn.model.Flight;
import com.sbtrain.assgn.repo.FlightRepository;

@RestController
public class Controller {
    
    @Autowired
    public FlightRepository flightRepo;

    @GetMapping("/flights")
    public ResponseEntity<?> getAvailableFlights() {
        List<Flight> allFlights = flightRepo.findAll();
        return ResponseEntity.ok().body(allFlights);
    }

    @PostMapping
    public ResponseEntity<?> makeBooking(@RequestBody Booking request) {
        // check if the flightId is valid
        Flight flight = flightRepo.findById(request.flightId).get();
        if(flight==null){
            return ResponseEntity.ok().body("Invalid Flight Id. Try again with valid flight Id");
        }
        // check if the flight has seats
        if(flight.availableSeats < request.numberOfSeats){
            return ResponseEntity.ok().body("The selected flight has only "+ flight.availableSeats +". Please book accordingly.");
        }

        Booking booked = new Booking(request.flightId, request.numberOfSeats, request.customerId,"Succesful");
        return ResponseEntity.ok().body(booked);
    }

    @GetMapping("/flights/filter")
    public ResponseEntity<?> fliteredFlights() {

        return ResponseEntity.ok().body("Working");
    }

    
}
