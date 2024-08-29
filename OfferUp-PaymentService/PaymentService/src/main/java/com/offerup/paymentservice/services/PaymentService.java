package com.offerup.paymentservice.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offerup.paymentservice.datatransferobjects.Payment;
import com.offerup.paymentservice.repositories.PaymentDB;

@Service
public class PaymentService {

	private PaymentDB paymentDB;
	
	@Autowired
	public PaymentService(PaymentDB paymentDB) {
		this.paymentDB = paymentDB;
	}

	public Boolean pay(Payment payment) throws IOException {
		paymentDB.insert(payment);
		return true;
	}
}