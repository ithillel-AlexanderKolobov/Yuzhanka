package org.hillel.it.yuzhanka.application.service;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Payment;

public interface PaymentService {
	void savePayment(Payment payment);
	void deletePayment(Payment payment);
	Payment findPaymentById(int id);
	List<Payment> getAllPayments();
}
