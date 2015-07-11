package org.hillel.it.yuzhanka.application.service.impl;

import java.util.List;

import org.hillel.it.yuzhanka.application.service.RoomTypeService;
import org.hillel.it.yuzhanka.model.entity.RoomType;
import org.hillel.it.yuzhanka.persistence.repository.ReservationRepository;
import org.hillel.it.yuzhanka.persistence.repository.RoomTypeRepository;
import org.hillel.it.yuzhanka.persistence.repository.impl.file.FileRepository;
import org.hillel.it.yuzhanka.persistence.repository.impl.inmemory.InMemoryRoomTypeRepository;

public class RoomTypeServiceImpl implements RoomTypeService {

	//RoomTypeRepository repository = new InMemoryRoomTypeRepository();
	RoomTypeRepository repository = FileRepository.getInstance().getRoomTypeRepository();

	@Override
	public void save(RoomType roomType) {
		repository.save(roomType);

	}

	@Override
	public void delete(RoomType roomType) {
		repository.delete(roomType);

	}

	@Override
	public RoomType findById(int id) {
		
		return repository.findById(id);
	}

	@Override
	public List<RoomType> findAll() {
		
		return repository.findAll();
	}

}
