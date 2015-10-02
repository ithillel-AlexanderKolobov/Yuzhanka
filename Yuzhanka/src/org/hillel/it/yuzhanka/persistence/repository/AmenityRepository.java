package org.hillel.it.yuzhanka.persistence.repository;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Amenity;


public interface AmenityRepository {
	void save(Amenity amenity);
	void delete(Amenity amenity);
	Amenity findById(int id);
	List<Amenity> findAll();
}
