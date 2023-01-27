package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Payment;
import com.repository.IPaymentRepository;

@Service
public class PaymentServiceImpl implements IPaymentService {

	@Autowired
	IPaymentRepository payRepo;

	@Override
	public Payment addPayment(Payment payment) {
		
		return payRepo.save(payment);
	}
}
