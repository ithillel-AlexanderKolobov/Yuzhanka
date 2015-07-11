package org.hillel.it.yuzhanka.persistence.repository.impl.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.hillel.it.yuzhanka.model.entity.User;
import org.hillel.it.yuzhanka.persistence.repository.UserRepository;

public class InMemoryUserRepository extends InMemoryBaseRepository<User> implements UserRepository {

	@Override
	public User findByEmail(String email) {
		List<User> userList = new ArrayList<>();
		for (User user : storage.values()) {
			if (user.getEmail().equals(email)) {
				return user;
			}
		}
		return null;
	}
	
}
