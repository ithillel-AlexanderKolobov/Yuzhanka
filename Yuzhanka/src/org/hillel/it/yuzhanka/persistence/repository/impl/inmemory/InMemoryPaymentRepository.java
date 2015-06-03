package org.hillel.it.yuzhanka.persistence.repository.impl.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Payment;
import org.hillel.it.yuzhanka.persistence.repository.PaymentRepository;

public class InMemoryPaymentRepository  implements PaymentRepository
{
	
	List <Payment> paymentList = new ArrayList<Payment>();
	
	int paymentId = 1;

	@Override
	public void savePayment(Payment payment)
	{
		
		if(payment.getId() == 0)
		{
			
			payment.setId(paymentId);
			paymentId++;
			paymentList.add(payment);
			
		}
		else
		{
			
		}
	}

	@Override
	public void deletePayment(Payment payment)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Payment getPaymentById(int id) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
