package org.hillel.it.yuzhanka.application.service.impl;

import java.util.List;

import org.hillel.it.yuzhanka.application.service.PaymentService;
import org.hillel.it.yuzhanka.model.entity.Payment;
import org.hillel.it.yuzhanka.persistence.repository.PaymentRepository;
import org.hillel.it.yuzhanka.persistence.repository.impl.file.FileRepository;
import org.hillel.it.yuzhanka.persistence.repository.impl.inmemory.InMemoryPaymentRepository;


public class PaymentServiceImpl implements PaymentService {
	PaymentRepository repository = new InMemoryPaymentRepository();
	//PaymentRepository repository = FileRepository.getInstance.getPaymantReposytory;

	@Override
	public void save(Payment payment) {
		repository.save(payment);

	}

	@Override
	public void delete(Payment payment) {
		repository.delete(payment);

	}

	@Override
	public Payment findById(int id) {

		return repository.findById(id);
	}

	@Override
	public List<Payment> findAll() {

		return repository.findAll();
	}

}
