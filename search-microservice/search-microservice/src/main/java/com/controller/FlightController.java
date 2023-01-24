package com.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.ResponseDto;
import com.entity.Flight;
import com.service.FlightServiceImpl;
import com.service.IFlightService;

import lombok.AllArgsConstructor;

		
@RestController
@RequestMapping("api/flight")
@AllArgsConstructor
@CrossOrigin
public class FlightController {
	
	@Autowired
	IFlightService flightService;
	
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Flight>> getAll(){
		List<Flight> d=flightService.getFlightlist();
			return new ResponseEntity<List<Flight>> (d,HttpStatus.OK);
		
	}
	
//	@GetMapping("/getOrigin/{origin}")
//	public ResponseEntity<List<Flight>> getOrigin(@PathVariable String origin){
//		List<Flight> d=flightService.getOrigin(origin);
//			return new ResponseEntity<List<Flight>> (d,HttpStatus.OK);
//		
//	}
	

	 @GetMapping("{flightId}")
	 public ResponseEntity<ResponseDto> getFlightFareById(@PathVariable long flightId)
	 {
		 ResponseDto responseDto = flightService.getFlightFareById(flightId);
	        return ResponseEntity.ok(responseDto);
	 }
	 
	 @GetMapping("/getbyOriginDestinationDepartureDate/{origin}/{destination}/{departureDate}")
		public List<Flight> getbyOriginDestinationDepartureDate(@PathVariable String origin,@PathVariable String destination, @PathVariable Date departureDate){
			return flightService.getbyOriginDestinationDepartureDate(origin, destination,departureDate);
		}


		@GetMapping("/date/{flightNum}/{departureDate}")
		public Flight getByDate(@PathVariable String flightNum, @PathVariable Date departureDate )
		{
			return flightService.getByDate(flightNum,departureDate);
			
		}
		@PostMapping("/get/fareOD")
	    public ResponseEntity<List<ResponseDto>> getOriginDestination(@RequestBody Flight flight){
	        List<ResponseDto> responseDto = flightService.getOriginDestination(flight);
	       
	        return new ResponseEntity (responseDto,HttpStatus.OK);
	    }
		
		@PostMapping("/getFare")
	    public ResponseEntity<List<ResponseDto>> getFlightFareByData(@RequestBody Flight flight){
	        List<ResponseDto> responseDto = flightService.getFlightFareByData(flight);
	       
	        return new ResponseEntity (responseDto,HttpStatus.OK);
	    }
		
		
//		 @GetMapping("/getFare/{origin}/{destination}/{departureDate}")
//		    public ResponseEntity<List<ResponseDto>> getFlightFareByData(@PathVariable String origin,@PathVariable String destination, @PathVariable String departureDate){
//		        List<ResponseDto> responseDto = flightService.getFlightFareByData(origin, destination, departureDate);
//		        return ResponseEntity.ok(responseDto);
//		    }
}
