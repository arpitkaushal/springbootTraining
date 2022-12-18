package com.sbtrain.assgn;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAccessor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sbtrain.assgn.model.Flight;
import com.sbtrain.assgn.repo.FlightRepository;

@SpringBootTest
class AppTest {

	@Autowired
	FlightRepository flightRepo;
	
	@Test
	void contextLoads() {
	}

	@Test
	void repl() {
		Flight x = new Flight("Indigo", LocalDateTime.now(), LocalDateTime.now(), "Delhi", "Ahmedabad", 24);
		flightRepo.save(x);
		System.out.println(x);
	}

}
