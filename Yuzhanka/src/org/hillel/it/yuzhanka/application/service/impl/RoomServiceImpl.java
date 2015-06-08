package org.hillel.it.yuzhanka.application.service.impl;

import java.util.List;

import org.hillel.it.yuzhanka.application.service.RoomService;
import org.hillel.it.yuzhanka.model.entity.Room;
import org.hillel.it.yuzhanka.persistence.repository.RoomRepository;
import org.hillel.it.yuzhanka.persistence.repository.impl.inmemory.InMemoryRoomRepository;

public class RoomServiceImpl implements RoomService
{
	RoomRepository repository = new InMemoryRoomRepository(); 

	@Override
	public void saveRoom(Room room)
	{
		repository.saveRoom(room);	
	}

	@Override
	public void deleteRoom(int roomId)
	{
		repository.deleteRoom(roomId);
	}

	@Override
	public Room findRoomById(int id) {
		
		return repository.findRoomById(id);
	}

	@Override
	public List<Room> findAllRooms() {
		
		return repository.findAllRooms();
	}

}
