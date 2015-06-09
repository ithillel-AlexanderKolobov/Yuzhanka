package org.hillel.it.yuzhanka.application.service.impl;

import java.util.List;

import org.hillel.it.yuzhanka.application.service.PaymentService;
import org.hillel.it.yuzhanka.model.entity.Payment;
import org.hillel.it.yuzhanka.persistence.repository.PaymentRepository;
import org.hillel.it.yuzhanka.persistence.repository.impl.inmemory.InMemoryPaymentRepository;


public class PaymentServiceImpl implements PaymentService {
	PaymentRepository repository = new InMemoryPaymentRepository();

	@Override
	public void savePayment(Payment payment) {
		repository.savePayment(payment);

	}

	@Override
	public void deletePayment(int paymentId) {
		repository.deletePayment(paymentId);

	}

	@Override
	public Payment findPaymentById(int id) {

		return repository.findPaymentById(id);
	}

	@Override
	public List<Payment> getAllPayments() {

		return repository.findAllPayments();
	}

}
