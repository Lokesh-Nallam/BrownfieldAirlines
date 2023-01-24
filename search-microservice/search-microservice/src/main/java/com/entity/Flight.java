package com.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long flightId;
		
	private String flightNum;
	private String flightName;
	private String origin;
	private String destination;
	@DateTimeFormat(pattern ="dd-MM-yyyy")
	private Date departureDate;
	
	private long fareId;
}
