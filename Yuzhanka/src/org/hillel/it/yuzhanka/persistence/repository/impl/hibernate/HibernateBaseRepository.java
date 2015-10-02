package org.hillel.it.yuzhanka.persistence.repository.impl.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hillel.it.yuzhanka.model.entity.BaseEntity;

public class HibernateBaseRepository<T extends BaseEntity> {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public void save(T entytiObject) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(entytiObject);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}

	}

	public void delete(T entytiObject) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.delete(entytiObject);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}
	}

	public T findById(int id) {
		return null;
	}

}
