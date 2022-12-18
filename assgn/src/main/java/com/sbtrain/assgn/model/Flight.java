package com.sbtrain.assgn.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @Column(unique = true)
    private String email;

    private LocalDate startDate;
    private String departureCity;
}
