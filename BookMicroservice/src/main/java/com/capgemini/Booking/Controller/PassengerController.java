package com.capgemini.Booking.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Booking.Entity.Passenger;
import com.capgemini.Booking.Service.passengerImpl;

@RestController
@RequestMapping("api/passenger")
public class PassengerController {
	
	@Autowired
	passengerImpl passenger;
	
	@PostMapping("/post/")
	public void addPassenger(@RequestBody Passenger p) {
		passenger.addPassenger(p);
	}
	
	@PutMapping("/update")
	public void updateBooking(@RequestBody Passenger p) 
	{
		passenger.updatePassenger(p);
	}
	
	@GetMapping("/getPassengerById/{id}")
	public  Optional<Passenger> getBookingById(Long id) {
		Optional<Passenger> p= passenger.getPassengerById(id);
		return p;
	}
     
	@GetMapping("/getAllPassengers")
	public List<Passenger> getAllPassengers(){
		return passenger.getAllPassenger();
	}
	
	
	@DeleteMapping("/delete/{id}")
	public void deletePassenger(Long id) {
		
		
		passenger.deletePassengerbyId(id);
	}
}
