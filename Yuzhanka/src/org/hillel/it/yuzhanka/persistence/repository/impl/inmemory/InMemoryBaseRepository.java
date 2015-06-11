package org.hillel.it.yuzhanka.persistence.repository.impl.inmemory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hillel.it.yuzhanka.model.entity.BaseEntity;

public class InMemoryBaseRepository<T extends BaseEntity> {
	protected Map<Integer, T> storage = new HashMap<>();
	protected int nextId = 1;

	public void save(T entytiObject) {
		if (entytiObject.getId() == 0) {
			entytiObject.setId(nextId);			
			storage.put(nextId, entytiObject);
			nextId++;
		} else {
			storage.replace(entytiObject.getId(), entytiObject);
		}

	}

	public void delete(T entytiObject) {
		storage.remove(entytiObject.getId());
	}

	public T findById(int id) {
		return storage.get(id);
	}
	
	public List<T> findAll() {
		return new ArrayList<>(storage.values());
	}
}
