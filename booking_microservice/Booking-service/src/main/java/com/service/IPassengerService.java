package com.service;

import org.springframework.stereotype.Service;

import com.entity.Passenger;

@Service
public interface IPassengerService {

	public Passenger addPassenger(Passenger passenger);

	
}
