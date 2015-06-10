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
		repository.save(room);	
	}

	@Override
	public void deleteRoom(Room room)
	{
		repository.delete(room);
	}

	@Override
	public Room findRoomById(int id) {
		
		return repository.findById(id);
	}

	@Override
	public List<Room> findAllRooms() {
		
		return repository.findAll();
	}

}
