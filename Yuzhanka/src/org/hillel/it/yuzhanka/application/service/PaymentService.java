package org.hillel.it.yuzhanka.application.service;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Payment;

public interface PaymentService {
	void save(Payment payment);
	void delete(Payment payment);
	Payment findById(int id);
	List<Payment> findAll();
}
