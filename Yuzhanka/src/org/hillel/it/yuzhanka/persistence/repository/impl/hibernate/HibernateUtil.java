package org.hillel.it.yuzhanka.persistence.repository.impl.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sesssionFactory = null;
	
	static {
		Configuration cfg = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
		
		sesssionFactory = cfg.buildSessionFactory(builder.build());
	}
	
	public static SessionFactory getSessionFactory() {
		return sesssionFactory;
	}
	
}
