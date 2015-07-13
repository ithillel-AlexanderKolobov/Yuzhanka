package org.hillel.it.yuzhanka.persistence.repository.impl.file;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.hillel.it.yuzhanka.model.entity.BaseEntity;

public abstract class FileBaseRepository<T extends BaseEntity> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected HashMap<Integer, T> storage = new HashMap<>();
	protected int nextId = 1;

	public void save(T entytiObject) {
		if (entytiObject.getId() == 0) {
			entytiObject.setId(nextId);
			storage.put(nextId, entytiObject);
			nextId++;
		} else {
			storage.replace(entytiObject.getId(), entytiObject);
		}
		FileRepository.getInstance().serialize();

	}

	public void delete(T entytiObject) {
		storage.remove(entytiObject.getId());
		FileRepository.getInstance().serialize();
	}

	public T findById(int id) {
		return storage.get(id);
	}

	public List<T> findAll() {
		return new ArrayList<>(storage.values());
	}

	public HashMap<Integer, T> getStorage() {
		return storage;
	}

	public void setStorage(HashMap<Integer, T> storage) {
		this.storage = storage;
	}

}
