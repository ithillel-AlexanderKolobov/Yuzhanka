package org.hillel.it.yuzhanka.persistence.repository;

import org.hillel.it.yuzhanka.model.entity.User;

public interface UserRepository 
{
	boolean addUser(User user);
	boolean changeUser(User newUser);
	boolean deleteUser(User user);

}
