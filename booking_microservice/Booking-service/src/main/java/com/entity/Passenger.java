package com.entity;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Passenger {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long passengerId;
    private String pnr;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String passportNumber;
    private String nationality;
    
   
    
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="BOOKING_ID")
//    @JsonIgnore
//    private Book book;

}
