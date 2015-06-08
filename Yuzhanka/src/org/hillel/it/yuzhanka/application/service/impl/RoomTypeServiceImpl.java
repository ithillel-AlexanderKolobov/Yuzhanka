package org.hillel.it.yuzhanka.application.service.impl;

import java.util.List;

import org.hillel.it.yuzhanka.application.service.RoomTypeService;
import org.hillel.it.yuzhanka.model.entity.RoomType;
import org.hillel.it.yuzhanka.persistence.repository.RoomTypeRepository;
import org.hillel.it.yuzhanka.persistence.repository.impl.inmemory.InMemoryRoomTypeRepository;

public class RoomTypeServiceImpl implements RoomTypeService {

	RoomTypeRepository repository = new InMemoryRoomTypeRepository();

	@Override
	public void saveRoomType(RoomType roomType) {
		repository.saveRoomType(roomType);

	}

	@Override
	public void deleteRoomType(int roomTypeId) {
		repository.deleteRoomType(roomTypeId);

	}

	@Override
	public RoomType findRoomTypeById(int id) {
		
		return repository.findRoomTypeById(id);
	}

	@Override
	public List<RoomType> getAllRoomTypes() {
		
		return repository.getAllRoomTypes();
	}

}
