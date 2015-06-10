package org.hillel.it.yuzhanka.persistence.repository;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.User;

public interface UserRepository 
{
	void save(User user);
	void delete(User user);
	User findById(int id);
	List<User> findAll();

}
