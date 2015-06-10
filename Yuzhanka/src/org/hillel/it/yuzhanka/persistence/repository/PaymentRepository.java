package org.hillel.it.yuzhanka.persistence.repository;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Payment;


public interface PaymentRepository 
{
	void save(Payment payment);
	void delete(Payment payment);
	Payment findById(int id);
	List<Payment> findAll();

}
