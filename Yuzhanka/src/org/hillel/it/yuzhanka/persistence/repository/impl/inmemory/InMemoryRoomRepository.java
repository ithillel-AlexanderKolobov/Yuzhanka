package org.hillel.it.yuzhanka.persistence.repository.impl.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Room;
import org.hillel.it.yuzhanka.persistence.repository.RoomRepository;

public class InMemoryRoomRepository implements RoomRepository
{
	
	List <Room> roomList = new ArrayList <Room>();

	int nextId = 1;
	
	@Override
	public void saveRoom(Room room)
	{

		
		if(room.getId() == 0)
		{
			room.setId(nextId);
			roomList.add(room);
			nextId++;
		}
		else
		{
			for(Room currentRoom : roomList)
			{
				if(currentRoom.getId() == room.getId())
				{
					roomList.remove(currentRoom);
					roomList.add(room);
				}
			}
		}
		
		
	}


	@Override
	public void deleteRoom(int roomId) 
	{
		for(Room room : roomList)
		{
			if(room.getId() == roomId)
			{
				roomList.remove(room);
			}
		}
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
