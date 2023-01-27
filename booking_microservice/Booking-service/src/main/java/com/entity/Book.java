package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.controller.Status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author dharicha
 *
 */
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	@Id
	@Column(name = "bookingId", nullable = false) 
	@GeneratedValue 
	private long bookingId;
	
	private String flightNum;
	private String origin;
	private String destination;
	private String departureDate;
	private long fare;
	private String fareLabel; 
	private long TotalFare;
	private String flightName;
	private String selectedSeats;
	
	private Status BookingStatus;
	@Override
	public String toString() {
		return "Book [bookingId=" + bookingId + ", flightNum=" + flightNum + ", origin=" + origin + ", destination="
				+ destination + ", departureDate=" + departureDate + ", fare=" + fare + ", fareLabel=" + fareLabel
				+ ", TotalFare=" + TotalFare + ", flightName=" + flightName + ", selectedSeats=" + selectedSeats
				+ ", BookingStatus=" + BookingStatus + "]";
	}
	
		public Book(long bookingId, String flightNum, String origin, String destination, String departureDate, long fare,
			String fareLabel, long totalFare, String flightName, String selectedSeats, Status bookingStatus) {
		super();
		this.bookingId = bookingId;
		this.flightNum = flightNum;
		this.origin = origin;
		this.destination = destination;
		this.departureDate = departureDate;
		this.fare = fare;
		this.fareLabel = fareLabel;
		TotalFare = totalFare;
		this.flightName = flightName;
		this.selectedSeats = selectedSeats;
		BookingStatus = bookingStatus;
	}

		public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public String getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public long getFare() {
		return fare;
	}

	public void setFare(long fare) {
		this.fare = fare;
	}

	public String getFareLabel() {
		return fareLabel;
	}

	public void setFareLabel(String fareLabel) {
		this.fareLabel = fareLabel;
	}

	public long getTotalFare() {
		return TotalFare;
	}

	public void setTotalFare(long totalFare) {
		TotalFare = totalFare;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getSelectedSeats() {
		return selectedSeats;
	}

	public void setSelectedSeats(String selectedSeats) {
		this.selectedSeats = selectedSeats;
	}

	public Status getBookingStatus() {
		return BookingStatus;
	}

	public void setBookingStatus(Status bookingStatus) {
		BookingStatus = bookingStatus;
	}

		public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
