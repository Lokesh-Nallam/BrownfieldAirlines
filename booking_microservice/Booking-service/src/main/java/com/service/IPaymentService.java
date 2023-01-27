package com.service;

import org.springframework.stereotype.Service;

import com.entity.Payment;

@Service
public interface IPaymentService {

	public Payment addPayment(Payment payment);
}
