package com.respository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Flight;

@Repository
public interface IFlightRepository extends JpaRepository<Flight, Long> {

	public Flight findByFlightNumAndDepartureDate(String flightNum, Date departureDate);
	public List<Flight> findByOriginAndDestinationAndDepartureDate(String origin, String destination,
			Date departureDate);

	public List<Flight> findByOrigin(String origin);
	public List<Flight> findByOriginAndDestination(String origin,String destination);

	

}
