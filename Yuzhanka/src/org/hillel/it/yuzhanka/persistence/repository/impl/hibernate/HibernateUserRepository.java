package org.hillel.it.yuzhanka.persistence.repository.impl.hibernate;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.User;
import org.hillel.it.yuzhanka.persistence.repository.UserRepository;


public class HibernateUserRepository extends HibernateBaseRepository<User> implements UserRepository {

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
