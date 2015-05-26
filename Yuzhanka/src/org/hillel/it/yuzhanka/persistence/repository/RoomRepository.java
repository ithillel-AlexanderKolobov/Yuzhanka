package org.hillel.it.yuzhanka.persistence.repository;

import org.hillel.it.yuzhanka.model.entity.Room;

public interface RoomRepository
{
	boolean addRoom(Room room);
	boolean changeRoom(Room newRoom);
	boolean deleteRoom(Room room);
	
}
