package org.hillel.it.yuzhanka.persistence.repository.impl.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hillel.it.yuzhanka.model.entity.Room;
import org.hillel.it.yuzhanka.persistence.repository.RoomRepository;

public class HibernateRoomRepository extends HibernateBaseRepository<Room> implements RoomRepository {

	@Override
	public List<Room> findAll() {
		List <Room> allRooms=null;
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Room.class);
			allRooms = criteria.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}
		return allRooms;
	}

}
