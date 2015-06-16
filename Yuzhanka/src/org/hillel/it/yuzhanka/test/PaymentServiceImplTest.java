package org.hillel.it.yuzhanka.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.hillel.it.yuzhanka.application.service.PaymentService;
import org.hillel.it.yuzhanka.application.service.impl.PaymentServiceImpl;
import org.hillel.it.yuzhanka.model.entity.Payment;
import org.hillel.it.yuzhanka.model.entity.User;
import org.hillel.it.yuzhanka.persistence.repository.PaymentRepository;
import org.hillel.it.yuzhanka.persistence.repository.impl.inmemory.InMemoryPaymentRepository;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.RepositoryIdHelper;

public class PaymentServiceImplTest {

	
	PaymentService repository = new PaymentServiceImpl();
	
	User client = new User("t@ukr.net", "12345", "Voronova", "Valentina", 
			"Vya4eslavovna", new Date(), "odessa", "kw1234", "umvs");
	
	Payment payment = new Payment(0,2000,0, client);
	

	
	
	@Test
	public void testSaveFirstNewPayment() 
	{	
		repository.save(payment);
		assertEquals(repository.findById(1).getAmount(), 2000);
	}
	
	@Test
	public void testChangePayment()
	{
		repository.save(payment);
		payment.setAmount(3000);
		repository.save(payment);
		assertEquals(repository.findById(payment.getId()).getAmount(),3000);
	}
	
	@Test
	public void testDeletePayment()
	{
		repository.save(payment);
		repository.delete(payment);
		assertEquals(repository.findById(payment.getId()),null);
	}

}


