package com.sbtrain.assgn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sbtrain.assgn.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

    @Query("select f from Flight f where f.departureCity = ?1 and f.arrivalCity = ?2")
    public Flight flightsBetweenCities(String departureCity, String arrivalCity);
}
