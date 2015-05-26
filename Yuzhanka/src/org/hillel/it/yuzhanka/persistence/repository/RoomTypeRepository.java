package org.hillel.it.yuzhanka.persistence.repository;

import org.hillel.it.yuzhanka.model.entity.RoomType;
import org.hillel.it.yuzhanka.model.entity.User;

public interface RoomTypeRepository
{
	boolean addRoomType(RoomType roomType);
	boolean changeRoomType(RoomType newRoomType);
	boolean deleteRoomType(RoomType roomType);
	RoomType getRoomTypeById(int id);

}
