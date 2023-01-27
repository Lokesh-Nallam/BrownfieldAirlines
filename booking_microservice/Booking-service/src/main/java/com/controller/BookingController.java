package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Book;
import com.service.IBookService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/book")
@AllArgsConstructor
@CrossOrigin
public class BookingController {

	@Autowired
	IBookService bookService;
	
	
	@PostMapping("/addBooking")
    public ResponseEntity<Book> addBook(@RequestBody Book book) 
    {
        Book upd= bookService.addbooking(book);
        return new ResponseEntity<Book>(upd,HttpStatus.CREATED);
        
    }
	@GetMapping(path="/get/{bookingId}")
	public ResponseEntity<Book> getBookById(@PathVariable int bookingId) 
	{
		Book c1=bookService.getBookID(bookingId);
		
		return new ResponseEntity<Book>(c1,HttpStatus.OK);
		
	}
	@PutMapping("/updateStatus/{bookingId}")
	public ResponseEntity<?> updateStatus(@PathVariable long bkid){
		String st=bookService.updateStatus(bkid);
		return new ResponseEntity<String>(st,HttpStatus.OK);
	}
	

}
