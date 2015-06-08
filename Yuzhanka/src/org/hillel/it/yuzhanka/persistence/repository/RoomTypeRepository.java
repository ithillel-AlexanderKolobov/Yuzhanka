package org.hillel.it.yuzhanka.persistence.repository;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.RoomType;

public interface RoomTypeRepository {
	void saveRoomType(RoomType roomType);

	void deleteRoomType(int roomTypeId);

	RoomType findRoomTypeById(int id);

	List<RoomType> findAllRoomTypes();

}
