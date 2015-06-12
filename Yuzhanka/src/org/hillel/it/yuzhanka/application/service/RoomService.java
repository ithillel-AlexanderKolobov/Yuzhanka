package org.hillel.it.yuzhanka.application.service;

import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Room;

public interface RoomService 
{
	void save(Room room);
	void delete(Room room);
	Room findById(int id);
	List <Room> findAll();

}
