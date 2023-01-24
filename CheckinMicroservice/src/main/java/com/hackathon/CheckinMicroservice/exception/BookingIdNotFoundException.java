package com.hackathon.CheckinMicroservice.exception;

public class BookingIdNotFoundException extends RuntimeException {
	public  BookingIdNotFoundException(String msg) {
		super(msg);
	}

}
