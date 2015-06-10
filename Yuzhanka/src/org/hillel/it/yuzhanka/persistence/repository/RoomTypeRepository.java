package org.hillel.it.yuzhanka.persistence.repository;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.RoomType;

public interface RoomTypeRepository {
	void save(RoomType roomType);

	void delete(RoomType roomType);

	RoomType findById(int id);

	List<RoomType> findAll();

}
