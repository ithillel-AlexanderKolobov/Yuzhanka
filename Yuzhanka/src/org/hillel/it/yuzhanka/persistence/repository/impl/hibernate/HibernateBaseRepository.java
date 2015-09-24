package org.hillel.it.yuzhanka.persistence.repository.impl.hibernate;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.BaseEntity;

public class HibernateBaseRepository<T extends BaseEntity> {
	SessionFactory session
	
	void save(T entytiObject) {		
	}
	void delete(T entytiObject) {
	}
	T findById(int id) {
		return null;
	}
	List<T> findAll() {
		return null;
	}
}
