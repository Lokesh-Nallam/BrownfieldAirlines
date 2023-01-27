package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Passenger;
import com.service.IPassengerService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/passenger")
@CrossOrigin
@AllArgsConstructor
public class PassengerController {

	@Autowired
	IPassengerService passengerService;
	
	@PostMapping("/add")
	public ResponseEntity<Passenger> addNewPassenger(@RequestBody Passenger pay)
	{
		Passenger p=passengerService.addPassenger(pay);
		
		return new ResponseEntity<Passenger> (p,HttpStatus.CREATED);
	}
	

}
