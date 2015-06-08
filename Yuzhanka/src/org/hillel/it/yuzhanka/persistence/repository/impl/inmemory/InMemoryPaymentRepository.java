package org.hillel.it.yuzhanka.persistence.repository.impl.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Payment;
import org.hillel.it.yuzhanka.persistence.repository.PaymentRepository;

public class InMemoryPaymentRepository implements PaymentRepository {

	List<Payment> paymentList = new ArrayList<Payment>();

	int paymentId = 1;

	@Override
	public void savePayment(Payment payment) {

		if (payment.getId() == 0) {
			payment.setId(paymentId);
			paymentList.add(payment);
			paymentId++;

		} else {
			for (Payment currentPayment : paymentList) {
				if (currentPayment.getId() == payment.getId()) {
					paymentList.remove(currentPayment);
					paymentList.add(payment);
				}
			}

		}
	}

	@Override
	public void deletePayment(int paymentId) {
		for (Payment payment : paymentList) {
			if (payment.getId() == paymentId) {
				paymentList.remove(payment);
			}
		}

	}

	@Override
	public Payment findPaymentById(int id) {
		for (Payment payment : paymentList) {
			if (payment.getId() == id) {
				return payment;
			}
		}
		return null;
	}

	@Override
	public List<Payment> findAllPayments() {
		
		return paymentList;
	}

}
