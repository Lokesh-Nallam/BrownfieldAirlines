package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dto.FareDto;
import com.dto.FlightDto;
import com.dto.ResponseDto;
import com.entity.Flight;
import com.respository.IFlightRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
//@Slf4j
public class FlightServiceImpl implements IFlightService {

	@Autowired
	IFlightRepository flightRepo;
		
	private RestTemplate restTemplate;
	@Override
	public List<Flight> getFlightlist() {
		
		return flightRepo.findAll();
	}	
	
	

	@Override
	public ResponseDto getFlightFareById(long flightId) {

			ResponseDto responseDto=new ResponseDto();
			Flight flight=flightRepo.findById(flightId).get();
			FlightDto flightDto=mapToUser(flight);
			
			ResponseEntity<FareDto> responseEntity = restTemplate
		                .getForEntity("http://localhost:9091/api/fares/" + flight.getFareId(),
		                FareDto.class);

		        FareDto fareDto = responseEntity.getBody();

		        System.out.println(responseEntity.getStatusCode());

		        responseDto.setFlightDto(flightDto);
		        responseDto.setFareDto(fareDto);

		        return responseDto;
		}

private FlightDto mapToUser(Flight flight)
{
	FlightDto flightDto=new FlightDto();
	
	flightDto.setFlightId(flight.getFlightId());
	flightDto.setFlightName(flight.getFlightName());
	flightDto.setFlightNum(flight.getFlightNum());
	flightDto.setOrigin(flight.getOrigin());
	flightDto.setDestination(flight.getDestination());
	flightDto.setDepartureDate(flight.getDepartureDate());
	return flightDto;
}

@Override
public List<Flight> getbyOriginDestinationDepartureDate(String origin, String destination, String departureDate) {

	return flightRepo.findByOriginAndDestinationAndDepartureDate(origin, destination, departureDate);
}

@Override
public Flight getByDate(String flightNum, String departureDate) {
	
	return flightRepo.findByFlightNumAndDepartureDate(flightNum, departureDate);
}



@Override
public List<ResponseDto> getFlightFareByData(String origin, String destination, String departureDate) {
	
	List<Flight> flight=flightRepo.findByOriginAndDestinationAndDepartureDate(origin,destination,departureDate);
	
	List<ResponseDto> r=new ArrayList<>();
	
	for(Flight f: flight)
	{
		FlightDto flightDto=mapToUser(f);
	ResponseEntity<FareDto> responseEntity =restTemplate
			.getForEntity("http://localhost:9091/api/fares/" +f.getFareId(),
					FareDto.class);
	FareDto fareDto =responseEntity.getBody();
	 System.out.println(responseEntity.getStatusCode());
	 ResponseDto rDto=new ResponseDto();
	 
	 rDto.setFareDto(fareDto);
	 rDto.setFlightDto(flightDto);
	 r.add(rDto);	
	
}
	return r;

}
}
