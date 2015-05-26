package org.hillel.it.yuzhanka.persistence.repository;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Payment;
import org.hillel.it.yuzhanka.model.entity.Room;

public interface PaymentRepository 
{
	boolean addPayment(Payment payment);
	boolean changePayment(Payment newPayment);
	boolean deletePayment(Payment payment);
	Payment getPaymentById(int id);
	List<Payment> getAllPayments();

}
