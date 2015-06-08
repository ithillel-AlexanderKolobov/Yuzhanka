package org.hillel.it.yuzhanka.persistence.repository;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Payment;


public interface PaymentRepository 
{
	void savePayment(Payment payment);
	void deletePayment(Payment payment);
	Payment getPaymentById(int id);
	List<Payment> getAllPayments();

}
