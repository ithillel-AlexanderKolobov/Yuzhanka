package org.hillel.it.yuzhanka.application.service;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Room;

public interface RoomService 
{
	void saveRoom(Room room);
	void deleteRoom(int roomId);
	Room getRoomById(int id);
	List <Room> getAllRooms();

}
