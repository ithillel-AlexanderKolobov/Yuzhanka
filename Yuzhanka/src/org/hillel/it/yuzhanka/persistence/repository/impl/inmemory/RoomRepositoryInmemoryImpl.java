package org.hillel.it.yuzhanka.persistence.repository.impl.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Room;
import org.hillel.it.yuzhanka.persistence.repository.RoomRepository;

public class RoomRepositoryInmemoryImpl implements RoomRepository
{
	
	List <Room> roomList = new ArrayList <Room>();

	@Override
	public boolean addRoom(Room room)
	{
		return roomList.add(room);
	}

	@Override
	public boolean changeRoom(Room oldRoom, Room newRoom) 
	{
		if(roomList.remove(oldRoom))
		{
			return roomList.add(newRoom);
		}
		return false;
	}

	@Override
	public boolean deleteRoom(Room room) 
	{
		return roomList.remove(room);
	}

	@Override
	public Room getRoomById(int id)
	{
		for(Room currentRoom : roomList)
		{
			if(currentRoom.getId() == id)
			{
				return currentRoom;
			}
		}
		return null;
	}

	@Override
	public List<Room> getAllRooms()
	{
		
		return roomList;
	}
	

}
