package org.hillel.it.yuzhanka.persistence.repository.impl.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hillel.it.yuzhanka.model.entity.Amenity;
import org.hillel.it.yuzhanka.persistence.repository.AmenityRepository;

public class HibernateAmenityRepository extends HibernateBaseRepository<Amenity> implements AmenityRepository {

	@Override
	public List<Amenity> findAll() {
		List <Amenity> allAmenities=null;
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			Criteria criteria = session.createCriteria(Amenity.class);
			allAmenities = criteria.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}
		return allAmenities;
	}

	
}
