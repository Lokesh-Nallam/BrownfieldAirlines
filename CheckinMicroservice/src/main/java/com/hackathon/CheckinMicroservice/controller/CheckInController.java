package com.hackathon.CheckinMicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.CheckinMicroservice.entity.BaggageList;
import com.hackathon.CheckinMicroservice.entity.CheckInList;
import com.hackathon.CheckinMicroservice.exception.BookingIdNotFoundException;
import com.hackathon.CheckinMicroservice.service.ICheckInService;


@RestController
@RequestMapping("/checkin")
public class CheckInController {
	
	@Autowired
	private ICheckInService checkSer;
	
	@PostMapping("/create")
	public long checkIn(@RequestBody CheckInList checkin) {
		return checkSer.checkIn(checkin);
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getCheckIn(@PathVariable long id ) throws BookingIdNotFoundException{
		CheckInList c=new CheckInList();
		try {
		c=checkSer.getCheckInRecord(id);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		 return new ResponseEntity<CheckInList> (c,HttpStatus.OK);
	}
	
	@PostMapping("/baggage")
	public ResponseEntity<?> bagTag(@RequestBody BaggageList bList ) throws BookingIdNotFoundException{
		long l;
		try {
			l=checkSer.bagTag(bList);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		return 	new ResponseEntity<Long>(l,HttpStatus.OK);}
}
