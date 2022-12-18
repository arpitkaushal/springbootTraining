package com.sbtrain.assgn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbtrain.assgn.model.Booking;
import com.sbtrain.assgn.model.Customer;
import com.sbtrain.assgn.model.Flight;
import com.sbtrain.assgn.repo.BookingRepository;
import com.sbtrain.assgn.repo.CustomerRepository;
import com.sbtrain.assgn.repo.FlightRepository;

@RestController
public class Controller {

    @Autowired
    public FlightRepository flightRepo;

    @Autowired
    public BookingRepository bookingRepo;

    @Autowired
    public CustomerRepository customerRepo;

    @GetMapping("/flights")
    public ResponseEntity<?> getAvailableFlights() {
        List<Flight> allFlights = flightRepo.findAll();
        return ResponseEntity.ok().body(allFlights);
    }

    @PostMapping("/book")
    public ResponseEntity<?> makeBooking(@RequestBody Booking request) {

        Flight flight = flightRepo.findById(request.flightId).get();

        if (flight == null) {
            return ResponseEntity.ok().body("Invalid Flight Id. Try again with valid flight Id");
        }

        if (flight.availableSeats < request.numberOfSeats) {
            return ResponseEntity.ok()
                    .body("The selected flight has only " + flight.availableSeats + ". Please book again accordingly.");
        }

        flight.availableSeats -= request.numberOfSeats;
        flightRepo.save(flight);

        Booking booked = new Booking(request.flightId, request.numberOfSeats, request.customerId, "Succesful");
        return ResponseEntity.ok().body(booked);
    }

    @PostMapping("/register/customer")
    public ResponseEntity<?> registerCustomer(@RequestBody Customer newCustomer) {
        Customer savedCustomer = customerRepo.save(newCustomer);
        return ResponseEntity.ok()
                .body("Registed Successfully. Pleaase note the following detatils:\t" + savedCustomer);
    }

    @GetMapping("/bookings")
    public ResponseEntity<?> getBookings() {
        List<Booking> allBookings = bookingRepo.findAll();
        return ResponseEntity.ok().body(allBookings);
    }

    @GetMapping("/customers")
    public ResponseEntity<?> getCustomers() {
        List<Customer> allCustomers = customerRepo.findAll();
        return ResponseEntity.ok().body(allCustomers);
    }

}
