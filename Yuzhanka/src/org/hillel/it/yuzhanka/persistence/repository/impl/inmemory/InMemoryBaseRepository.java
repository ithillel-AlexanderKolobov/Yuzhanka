package org.hillel.it.yuzhanka.persistence.repository.impl.inmemory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hillel.it.yuzhanka.model.entity.Reservation;

public class InMemoryBaseRepository {
	Map<Integer, Reservation> storage = new HashMap<>();
	int nextId = 1;

	public void save(Reservation reservation) {
		if (reservation.getId() == 0) {
			reservation.setId(nextId);			
			storage.put(nextId, reservation);
			nextId++;
		} else {
			storage.replace(reservation.getId(), reservation);
		}

	}

	public void delete(Reservation reservation) {
		storage.remove(reservation.getId());
	}

	public Reservation getById(int id) {
		return storage.get(id);
	}
	
	public List<Reservation> findAll() {
		return new ArrayList<>(storage.values());
	}
}
