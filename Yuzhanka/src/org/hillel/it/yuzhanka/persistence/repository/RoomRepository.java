package org.hillel.it.yuzhanka.persistence.repository;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Room;

public interface RoomRepository
{
	void save(Room room);
	void delete(Room room);
	Room findById(int id);
	List <Room> findAll();
	
}
