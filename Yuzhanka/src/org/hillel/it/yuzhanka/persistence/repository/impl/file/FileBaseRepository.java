package org.hillel.it.yuzhanka.persistence.repository.impl.file;

import java.io.Serializable;
import java.util.List;
import org.hillel.it.yuzhanka.model.entity.BaseEntity;
import org.hillel.it.yuzhanka.persistence.repository.impl.inmemory.InMemoryBaseRepository;

public abstract class FileBaseRepository <T extends BaseEntity> extends InMemoryBaseRepository<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void save(T entytiObject) {
		super.save(entytiObject);
		FileRepository.getInstance().serialize();

	}

	public void delete(T entytiObject) {
		super.delete(entytiObject);
		FileRepository.getInstance().serialize();
	}

	public T findById(int id) {
		return super.findById(id);
	}

	public List<T> findAll() {
		return super.findAll();
	}

	

}
