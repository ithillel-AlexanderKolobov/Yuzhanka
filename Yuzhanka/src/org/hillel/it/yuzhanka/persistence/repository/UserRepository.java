package org.hillel.it.yuzhanka.persistence.repository;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.User;

public interface UserRepository 
{
	boolean addUser(User user);
	boolean changeUser(User newUser);
	boolean deleteUser(User user);
	User getUserById(int id);
	List<User> getAllUsers();

}
