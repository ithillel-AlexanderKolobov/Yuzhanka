package org.hillel.it.yuzhanka.application.service;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.User;

public interface UserService {
	void saveUser(User user);
	void deleteUser(int userId);
	User findUserById(int id);
	List<User> getAllUsers();

}
