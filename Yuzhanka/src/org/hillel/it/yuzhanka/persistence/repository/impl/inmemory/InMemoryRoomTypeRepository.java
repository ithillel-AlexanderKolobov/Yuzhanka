package org.hillel.it.yuzhanka.persistence.repository.impl.inmemory;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.yuzhanka.model.entity.RoomType;
import org.hillel.it.yuzhanka.persistence.repository.RoomTypeRepository;

public class InMemoryRoomTypeRepository implements RoomTypeRepository {

	private List<RoomType> roomTypeList = new ArrayList<RoomType>();
	private int nextId = 1;

	@Override
	public void saveRoomType(RoomType roomType) {
		if (roomType.getId() == 0) {
			roomType.setId(nextId);
			roomTypeList.add(roomType);
			nextId++;
		} else {
			for (RoomType type : roomTypeList) {
				if (type.getId() == roomType.getId()) {
					roomTypeList.remove(type);
					roomTypeList.add(roomType);
				}
			}
		}

	}

	@Override
	public void deleteRoomType(int roomTypeId) {
		for (RoomType type : roomTypeList) {
			if (type.getId() == roomTypeId) {
				roomTypeList.remove(type);
			}
		}

	}

	@Override
	public RoomType findRoomTypeById(int id) {
		for (RoomType type : roomTypeList) {
			if (type.getId() == id) {
				return type;
			}
		}
		return null;
	}

	@Override
	public List<RoomType> findAllRoomTypes() {
		return roomTypeList;
	}

}
