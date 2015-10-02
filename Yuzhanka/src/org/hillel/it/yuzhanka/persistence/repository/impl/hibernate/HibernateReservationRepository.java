package org.hillel.it.yuzhanka.persistence.repository.impl.hibernate;

import java.util.Date;
import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.hillel.it.yuzhanka.model.entity.User;
import org.hillel.it.yuzhanka.persistence.repository.ReservationRepository;

public class HibernateReservationRepository extends HibernateBaseRepository<Reservation> implements ReservationRepository {

	@Override
	public List<Reservation> findByOwner(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation findByOrderClientFormat(String orderClientFormat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> findActiveByPeriod(Date start, Date end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
