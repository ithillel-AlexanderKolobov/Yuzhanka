package org.hillel.it.yuzhanka.persistence.repository;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Room;

public interface RoomRepository
{
	void saveRoom(Room room);
	void deleteRoom(int roomId);
	Room findRoomById(int id);
	List <Room> findAllRooms();
	
}
