package org.hillel.it.yuzhanka.application.service;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.RoomType;

public interface RoomTypeService {
	void saveRoomType(RoomType roomType);
	void deleteRoomType(int roomTypeId);
	RoomType findRoomTypeById(int id);
	List <RoomType> getAllRoomTypes();
}
