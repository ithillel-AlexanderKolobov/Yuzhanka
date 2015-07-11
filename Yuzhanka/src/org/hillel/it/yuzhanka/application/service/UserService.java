package org.hillel.it.yuzhanka.application.service;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.User;

public interface UserService {
	void save(User user);
	void delete(User user);
	User findById(int id);
	List<User> findAll();
	User findByEmail(String email);

}
