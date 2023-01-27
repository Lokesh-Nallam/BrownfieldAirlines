package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Passenger;
import com.repository.IPassengerRepository;

@Service
public class PassengerServiceImpl implements IPassengerService {

	@Autowired
	IPassengerRepository passengerRepo;
	@Override
	public Passenger addPassenger(Passenger passenger) {
		
		return passengerRepo.save(passenger);
	}
	
//	@Override
//	public void updatePassenger(Passenger passenger) {
//		// TODO Auto-generated method stub
//		Passenger p = passengerRepo.getById(passenger.getPassengerId());
//		passengerRepo.save(passenger);
//		
//	}


}
