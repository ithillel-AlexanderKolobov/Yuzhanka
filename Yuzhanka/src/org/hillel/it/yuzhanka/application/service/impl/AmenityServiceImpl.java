package org.hillel.it.yuzhanka.application.service.impl;

import java.util.List;

import org.hillel.it.yuzhanka.application.service.AmenityService;
import org.hillel.it.yuzhanka.model.entity.Amenity;
import org.hillel.it.yuzhanka.persistence.repository.AmenityRepository;
import org.hillel.it.yuzhanka.persistence.repository.impl.hibernate.HibernateAmenityRepository;

public class AmenityServiceImpl implements AmenityService{
	AmenityRepository repository;
	
	public AmenityServiceImpl() {
		repository = new HibernateAmenityRepository();
	}

	@Override
	public void save(Amenity amenity) {
		repository.save(amenity);
		
	}

	@Override
	public void delete(Amenity amenity) {
		repository.delete(amenity);		
	}

	@Override
	public Amenity findById(int id) {
		return repository.findById(id);
	}

	@Override
	public List<Amenity> findAll() {
		return repository.findAll();
	}



}
