package org.hillel.it.yuzhanka.persistence.repository.impl.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hillel.it.yuzhanka.model.entity.RoomType;
import org.hillel.it.yuzhanka.persistence.repository.RoomTypeRepository;

public class HibernateRoomTypeRepository extends HibernateBaseRepository<RoomType> implements RoomTypeRepository{

	@Override
	public List<RoomType> findAll() {
		List <RoomType> allRoomTypes=null;
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			Criteria criteria = session.createCriteria(RoomType.class);
			allRoomTypes = criteria.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}
		return allRoomTypes;
	}

}
