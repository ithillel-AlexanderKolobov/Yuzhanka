package org.hillel.it.yuzhanka.application.service.impl;

import java.util.List;

import org.hillel.it.yuzhanka.application.service.UserService;
import org.hillel.it.yuzhanka.model.entity.User;
import org.hillel.it.yuzhanka.persistence.repository.UserRepository;
import org.hillel.it.yuzhanka.persistence.repository.impl.inmemory.InMemoryUserRepository;

public class UserServiceImpl implements UserService {
	UserRepository repository = new InMemoryUserRepository();

	@Override
	public void saveUser(User user) {
		repository.save(user);

	}

	@Override
	public void deleteUser(User user) {
		repository.delete(user);

	}

	@Override
	public User findUserById(int id) {

		return repository.findById(id);
	}

	@Override
	public List<User> getAllUsers() {

		return repository.findAll();
	}

}
