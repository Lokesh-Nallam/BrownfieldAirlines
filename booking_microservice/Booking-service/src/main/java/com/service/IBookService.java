package com.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.entity.Book;
import com.entity.Inventory;
import com.entity.Passenger;

@Service
public interface IBookService {

	public Book getBookID(long bookingId);
	public List<Book> getAllBookingDetails();
	public List<Inventory> getInventory();
	public Book updateBooking(Book book);
	//public void updatestatus(String status,long bookingid);
	
//	public ResponseDto getFlightwithbook(String flightNum);
	  public Book addbooking(Book book);
	public String updateStatus(long bkid);
	

}
