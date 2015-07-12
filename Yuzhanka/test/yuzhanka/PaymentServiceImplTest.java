package yuzhanka;

import static org.junit.Assert.*;

import org.hillel.it.yuzhanka.model.enums.Currency;
import org.hillel.it.yuzhanka.model.enums.PaymentMethod;

import java.util.Date;
import java.util.List;

import org.hillel.it.yuzhanka.application.service.PaymentService;
import org.hillel.it.yuzhanka.application.service.impl.PaymentServiceImpl;
import org.hillel.it.yuzhanka.model.entity.Payment;
import org.hillel.it.yuzhanka.model.entity.User;
import org.junit.Before;
import org.junit.Test;

public class PaymentServiceImplTest {
	private PaymentService repository;
	private Payment payment;
	private Payment payment1;
	private Payment payment2;

	@Before
	public void setup() {
		repository = new PaymentServiceImpl();

		User client = new User("t@ukr.net", "12345", "Voronova", "Valentina",
				"Vya4eslavovna", new Date(), "odessa", "kw1234", "umvs");
		
		payment = new Payment(PaymentMethod.CASH, 1000, Currency.UAH , client);
		payment1 = new Payment(PaymentMethod.CASH, 2000, Currency.UAH , client);
		payment2 = new Payment(PaymentMethod.CASH, 3000, Currency.UAH , client);

	}

	@Test
	public void testSaveFirstNewPayment() {
		repository.save(payment);
		assertEquals(repository.findById(1).getAmount(), 2000);
	}

	@Test
	public void testChangePayment() {
		repository.save(payment);
		payment.setAmount(3000);
		repository.save(payment);
		assertEquals(repository.findById(payment.getId()).getAmount(), 3000);
	}

	@Test
	public void testDeletePayment() {
		repository.save(payment);
		repository.delete(payment);
		assertEquals(repository.findById(payment.getId()), null);
	}

	@Test
	public void testFindByIdIfItExists() {
		repository.save(payment);
		repository.save(payment1);
		repository.save(payment2);
		assertEquals(repository.findById(3).getAmount(), 4000);
	}

	@Test
	public void testFindByIdIfDoesntExist() {
		repository.save(payment);
		repository.save(payment1);
		repository.save(payment2);
		assertEquals(repository.findById(10), null);
	}

	@Test
	public void testFindAll() {
		repository.save(payment);
		repository.save(payment1);
		repository.save(payment2);
		List<Payment> payments = repository.findAll();
		assertEquals(payments.size(), 3);
	}

	@Test
	public void testFindAllNoPayments() {
		List<Payment> payments = repository.findAll();
		assertEquals(payments.size(), 0);
	}

}
