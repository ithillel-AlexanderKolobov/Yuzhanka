package org.hillel.it.yuzhanka.persistence.repository;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.User;

public interface UserRepository 
{
	void saveUser(User user);
	void deleteUser(int userId);
	User findUserById(int id);
	List<User> findAllUsers();

}
