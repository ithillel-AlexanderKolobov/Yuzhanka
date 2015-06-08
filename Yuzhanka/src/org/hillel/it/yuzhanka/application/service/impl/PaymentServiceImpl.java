package org.hillel.it.yuzhanka.application.service.impl;

import java.util.List;

import org.hillel.it.yuzhanka.application.service.PaymentService;
import org.hillel.it.yuzhanka.model.entity.Payment;
import org.hillel.it.yuzhanka.persistence.repository.PaymentRepository;
import org.hillel.it.yuzhanka.persistence.repository.impl.inmemory.InMemoryPaymentRepository;
import org.omg.CORBA.RepositoryIdHelper;

public class PaymentServiceImpl implements PaymentService {
	PaymentRepository repository = new InMemoryPaymentRepository();

	@Override
	public void savePayment(Payment payment) {
		repository.savePayment(payment);

	}

	@Override
	public void deletePayment(Payment payment) {
		repository.deletePayment(payment);

	}

	@Override
	public Payment findPaymentById(int id) {

		return repository.getPaymentById(id);
	}

	@Override
	public List<Payment> getAllPayments() {

		return repository.getAllPayments();
	}

}
