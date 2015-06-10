package org.hillel.it.yuzhanka.application.service;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.RoomType;

public interface RoomTypeService {
	void save(RoomType roomType);
	void delete(RoomType roomType);
	RoomType findById(int id);
	List <RoomType> findAll();
}
