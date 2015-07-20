package org.hillel.it.yuzhanka.application.service.impl;

import java.util.List;

import org.hillel.it.yuzhanka.application.service.RoomService;
import org.hillel.it.yuzhanka.model.entity.Room;
import org.hillel.it.yuzhanka.persistence.repository.RoomRepository;
import org.hillel.it.yuzhanka.persistence.repository.impl.file.FileRepository;

public class RoomServiceImpl implements RoomService {

	// RoomRepository rooms = new RoomRepository();
	// RoomRepository repository = new InMemoryRoomRepository();
	RoomRepository repository;

	public RoomServiceImpl() {
		repository = FileRepository.getInstance().getRoomRepository();
	}

	@Override
	public void save(Room room) {
		repository.save(room);
	}

	@Override
	public void delete(Room room) {
		repository.delete(room);
	}

	@Override
	public Room findById(int id) {

		return repository.findById(id);
	}

	@Override
	public List<Room> findAll() {

		return repository.findAll();
	}

}
