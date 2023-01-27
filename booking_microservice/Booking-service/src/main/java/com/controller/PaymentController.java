package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Payment;
import com.service.IPaymentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/payment")
@CrossOrigin
@AllArgsConstructor
public class PaymentController {

	@Autowired
	IPaymentService payService;
	
	@PostMapping("/add")
	public ResponseEntity<Payment> addNewPayment( @RequestBody Payment payment)
	{
		Payment pay= payService.addPayment(payment);
		return new ResponseEntity<Payment> (pay,HttpStatus.CREATED);
		
	}
}
