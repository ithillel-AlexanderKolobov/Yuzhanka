package org.hillel.it.yuzhanka.starter;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hillel.it.yuzhanka.application.service.AmenityService;
import org.hillel.it.yuzhanka.application.service.UserService;
import org.hillel.it.yuzhanka.application.service.impl.AmenityServiceImpl;
import org.hillel.it.yuzhanka.application.service.impl.UserServiceImpl;
import org.hillel.it.yuzhanka.model.entity.Amenity;
import org.hillel.it.yuzhanka.model.entity.User;
import org.hillel.it.yuzhanka.persistence.repository.impl.hibernate.HibernateUtil;

public class Starter {

	public static void main(String[] args) {
		/*SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		User user = new User();
		user.setFirstName("yurii");
		session.save(user);
		session.close();
		session.getTransaction().commit();
		*/
		AmenityService amenityService = new AmenityServiceImpl();
		
		for(Amenity amenity:amenityService.findAll()){
			System.out.println(amenity.getName());
		}
		
		/*
		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();
		session2.delete(user);
		User user2 = new User();
		user2.setFirstName("alex");
		session2.save(user2);
		session2.getTransaction().commit();
		*/

		//sessionFactory.close();
		/*
		 * User user1 = new User(); User user2 = new User(); User user3 = new
		 * User(); User user4 = new User(); User user5 = new User();
		 * user1.setFirstName("rette"); user2.setFirstName("Alex");
		 * user3.setFirstName("Valentina"); user4.setFirstName("Sergey");
		 * user5.setFirstName("igor");
		 * 
		 * UserService users = new UserServiceImpl(); users.save(user1);
		 * users.save(user2); users.save(user3); users.save(user4);
		 * users.save(user5);
		 * 
		 * 
		 * List<User> usersFromFile = users.findAll(); if (usersFromFile.size()
		 * > 0) { for (User userToPrint : usersFromFile) {
		 * System.out.println(userToPrint.getFirstName()); } } else {
		 * System.out.println("No Users in file"); users.save(user1);
		 * users.save(user2); users.save(user3); users.save(user4);
		 * users.save(user5); }
		 */

	}

}
