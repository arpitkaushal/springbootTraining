package com.sbtrain.assgn.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbtrain.assgn.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

    public Booking findByCustomerId(int customerId);
}
