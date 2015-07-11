package org.hillel.it.yuzhanka.persistence.repository.impl.file;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.yuzhanka.model.entity.User;
import org.hillel.it.yuzhanka.persistence.repository.UserRepository;

public class FileUserRepository extends FileBaseRepository<User> implements UserRepository {

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
