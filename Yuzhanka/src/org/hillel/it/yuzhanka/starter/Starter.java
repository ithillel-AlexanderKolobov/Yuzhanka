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
	//	User user1 = new User();
//		User user2 = new User();
//		User user3 = new User();
//		User user4 = new User();
//		User user5 = new User();
	//	user1.setFirstName("Yurii");
//		user2.setFirstName("Alex");
//		user3.setFirstName("Valentina");
//		user4.setFirstName("Sergey");
//		user5.setFirstName("igor");

		UserService users = new UserServiceImpl();
	//	users.save(user1);
//		users.save(user2);
//		users.save(user3);
//		users.save(user4);
//		users.save(user5);

		List<User> usersFromFile = users.findAll();
		if (usersFromFile.size() > 0) {
			for (User userToPrint : usersFromFile) {
				System.out.println(userToPrint.getFirstName());
			}
		} else {
			System.out.println("No Users in file");
//			users.save(user1);
//			users.save(user2);
//			users.save(user3);
//			users.save(user4);
//			users.save(user5);
		}
		

	}

}
