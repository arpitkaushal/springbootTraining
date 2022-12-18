package com.sbtrain.assgn;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sbtrain.assgn.model.Booking;
import com.sbtrain.assgn.model.Customer;
import com.sbtrain.assgn.model.Flight;
import com.sbtrain.assgn.repo.BookingRepository;
import com.sbtrain.assgn.repo.CustomerRepository;
import com.sbtrain.assgn.repo.FlightRepository;

@SpringBootTest
class AppTest {

	@Autowired
	FlightRepository flightRepo;

	@Autowired
	BookingRepository bookingRepo;

	@Autowired
	CustomerRepository customerRepo;

	@Test
	void contextLoads() {
	}

	@Test
	void generateFlight() {
		Flight newFlight = new Flight("Indigo", LocalDateTime.now(), LocalDateTime.now(), "Delhi", "Ahmedabad", 24);
		flightRepo.save(newFlight);
		System.out.println(newFlight);
	}

	@Test
	void generateBooking() {
		Booking newBooking = new Booking(145, 3, 146, "Succesful");
		Booking saveedBooking = bookingRepo.save(newBooking);
		System.out.println(saveedBooking);
	}

	@Test
	void generateCustomer() {
		Customer newCustomer = new Customer("Arpit", "arpit.kaushal@addverb.com");
		Customer savedCustomer = customerRepo.save(newCustomer);
		System.out.println(savedCustomer);
	}

}
