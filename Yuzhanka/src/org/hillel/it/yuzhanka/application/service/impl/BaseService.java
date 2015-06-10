package org.hillel.it.yuzhanka.application.service.impl;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.BaseEntity;
import org.hillel.it.yuzhanka.persistence.repository.impl.inmemory.InMemoryBaseRepository;

public class BaseService<T extends BaseEntity> {
	InMemoryBaseRepository<T> repository = new InMemoryBaseRepository<T>();

	public void save(T entityObject) {
		repository.save(entityObject);
	}
	
	public void delete(T entityobject){
		repository.delete(entityobject);
	}
	
	public T findById(int id){
		return repository.findById(id);
	}
	
	public List<T> findAll(){
		return repository.findAll();
	}
}
