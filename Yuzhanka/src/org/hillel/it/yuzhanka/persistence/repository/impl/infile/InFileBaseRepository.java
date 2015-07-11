package org.hillel.it.yuzhanka.persistence.repository.impl.infile;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hillel.it.yuzhanka.model.entity.BaseEntity;

public class InFileBaseRepository<T extends BaseEntity> implements Serializable {

	
	
	
	private void saveToFile(String className)
	{
		try {
			Class actualClass = storage.getClass();
			String fileName = actualClass.getName();

			FileOutputStream fos = new FileOutputStream(fileName
					+ "Repository.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(storage);
			oos.flush();
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	InFileBaseRepository()
	{
		try {
			Class actualClass = storage.getClass();
			String fileName = actualClass.getName();

			FileOutputStream fos = new FileOutputStream(fileName
					+ "Repository.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(storage);
			oos.flush();
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private readFromFile()
	{
		
	}

	protected Map<Integer, T> storage = new HashMap<>();
	protected int nextId = 1;

	public void save(T entytiObject) {
		if (entytiObject.getId() == 0) {
			entytiObject.setId(nextId);
			storage.put(nextId, entytiObject);
			nextId++;
		} else {
			storage.replace(entytiObject.getId(), entytiObject);
			entytiObject.getClass().getName()
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
