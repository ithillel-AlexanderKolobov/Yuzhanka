package org.hillel.it.yuzhanka.persistence.repository.impl.hibernate;


import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Payment;
import org.hillel.it.yuzhanka.persistence.repository.PaymentRepository;

public class HibernatePaymentRepository extends HibernateBaseRepository<Payment> implements PaymentRepository{

	@Override
	public List<Payment> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
