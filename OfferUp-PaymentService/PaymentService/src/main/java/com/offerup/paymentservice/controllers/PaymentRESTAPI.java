package com.offerup.paymentservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.offerup.paymentservice.datatransferobjects.Payment;
import com.offerup.paymentservice.services.PaymentService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/pay")
public class PaymentRESTAPI {
	
	@Autowired
	private PaymentService paymentService;
	
	@Autowired
	public PaymentRESTAPI(PaymentService paymentService){
		this.paymentService = paymentService;
	}
	
	@PostMapping("/attemptPay")
	public ResponseEntity<Boolean> Pay(@RequestBody Payment payment) {
		System.out.println(payment);
		try {
			Boolean response =  paymentService.pay(payment);
			return ResponseEntity.ok(response);
		}catch(Exception e) {
			return ResponseEntity.badRequest().build();
		}
	}
}
