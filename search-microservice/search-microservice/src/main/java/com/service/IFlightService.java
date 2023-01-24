package com.service;

import java.sql.Date;
import java.util.List;

import com.dto.ResponseDto;
import com.entity.Flight;

public interface IFlightService {

	public List<Flight> getFlightlist();
	public ResponseDto getFlightFareById(long flightId);
	public List<Flight> getbyOriginDestinationDepartureDate(String origin, String destination, Date departureDate);
	public Flight getByDate(String flightNum, Date departureDate);
	
//	public List<ResponseDto> getFlightFareByData(String origin, String destination, String departureDate);
	public List<ResponseDto> getFlightFareByData(Flight flight);
	
	public List<ResponseDto> getOriginDestination(Flight flight);
	
}
