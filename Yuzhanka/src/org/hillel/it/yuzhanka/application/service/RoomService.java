package org.hillel.it.yuzhanka.application.service;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Room;

public interface RoomService 
{
	void saveRoom(Room room);
	void deleteRoom(Room room);
	Room findRoomById(int id);
	List <Room> findAllRooms();

}
