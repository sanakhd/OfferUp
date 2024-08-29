package com.offerup.paymentservice.repositories;

import org.springframework.stereotype.Repository;

import com.offerup.paymentservice.datatransferobjects.Payment;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface PaymentDB extends MongoRepository<Payment, String>{
	Payment insert(Payment payment);
}
