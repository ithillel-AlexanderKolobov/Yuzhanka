package org.hillel.it.yuzhanka.persistence.repository;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Room;

public interface RoomRepository
{
	boolean addRoom(Room room);
	boolean changeRoom(Room oldRoom, Room newRoom);
	boolean deleteRoom(Room room);
	Room getRoomById(int id);
	List <Room> getAllRooms();
	
}
