package org.hillel.it.yuzhanka.starter;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.yuzhanka.application.service.PaymentService;
import org.hillel.it.yuzhanka.application.service.UserService;
import org.hillel.it.yuzhanka.application.service.impl.PaymentServiceImpl;
import org.hillel.it.yuzhanka.application.service.impl.UserServiceImpl;
import org.hillel.it.yuzhanka.model.entity.Payment;
import org.hillel.it.yuzhanka.model.entity.User;

public class Starter {

	public static void main(String[] args) {
		User user1=new User();
		User user2=new User();
		User user3=new User();
		User user4=new User();
		User user5=new User();
		user1.setFirstName("Yurii");
		user2.setFirstName("Alex");
		user3.setFirstName("Valentina");
		user4.setFirstName("Sergey");
		user5.setFirstName("Igor");
		Payment payment = new Payment();
		payment.setAmount(100);
		payment.setClient(user1);
		user1.getPayments().add(payment);
		UserService users = new UserServiceImpl();
		PaymentService paymants = new PaymentServiceImpl();
		users.save(user1);
		paymants.save(payment);
		List <User> usersFromFile=users.findAll();
		if (usersFromFile.size()>0){
			for (User userToPrint: usersFromFile){
				System.out.println(userToPrint.getFirstName());
			}
		} else {
			System.out.println("No Users in file");
		users.save(user1);
		users.save(user2);
		users.save(user3);
		users.save(user4);
		users.save(user5);
		}
		System.out.println(usersFromFile.get(0).getPayments().get(0).getAmount());
		System.out.println(users.findAll().get(0).getPayments().get(0)==paymants.findAll().get(0));
		

	}

}
