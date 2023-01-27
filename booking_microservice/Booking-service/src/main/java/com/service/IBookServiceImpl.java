package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.controller.Status;
import com.entity.Book;
import com.entity.Inventory;
import com.entity.Passenger;
import com.repository.IBookingRepository;


import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class IBookServiceImpl implements IBookService {

	@Autowired
	IBookingRepository bookingRepo;
	
	@Override
	public Book getBookID(long bookingId) {
		
	
		return bookingRepo.findById(bookingId).get();
		
		
		}
	@Override
	public List<Book> getAllBookingDetails() {
		
		return bookingRepo.findAll();

	}

	@Override
	public List<Inventory> getInventory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book updateBooking(Book book) {
		
		Optional<Book> books = bookingRepo.findById(book.getBookingId());
		 if(books.isPresent())
		  {
			  Book bookss=books.get();
		  }
		return book;
	}
	

	@Override
	public Book addbooking(Book book) {
		book.setBookingStatus(Status.BOOKING_CONFIRMED);
		return bookingRepo.save(book);
	}
	@Override
	public String updateStatus(long bkid) {
		Book bk=getBookID(bkid);
		bk.setBookingStatus(Status.BOARDED);
		bookingRepo.save(bk);
		return "Booking status updated successfully";
	}

}
