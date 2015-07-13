package org.hillel.it.yuzhanka.persistence.repository.impl.file;

import org.hillel.it.yuzhanka.model.entity.User;
import org.hillel.it.yuzhanka.persistence.repository.UserRepository;

public class FileUserRepository extends FileBaseRepository<User>implements UserRepository {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public User findByEmail(String email) {
		for (User user : storage.values()) {
			if (user.getEmail().equals(email)) {
				return user;
			}
		}
		return null;
	}

}
