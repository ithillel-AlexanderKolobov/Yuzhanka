package org.hillel.it.yuzhanka.application.service.impl;

import java.util.List;

import org.hillel.it.yuzhanka.application.service.RoomService;
import org.hillel.it.yuzhanka.model.entity.Room;

public class RoomServiceImpl implements RoomService
{
	RoomRepository rooms = new RoomRepository(); 

	@Override
	public void saveRoom(Room room)
	{
			
	}

	@Override
	public void deleteRoom(int roomId)
	{
		
	}

	@Override
	public Room getRoomById(int id) {
		
		return null;
	}

	@Override
	public List<Room> getAllRooms() {
		
		return null;
	}

}
