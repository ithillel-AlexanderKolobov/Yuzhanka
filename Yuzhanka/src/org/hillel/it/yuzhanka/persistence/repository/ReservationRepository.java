package org.hillel.it.yuzhanka.persistence.repository;

import java.util.Date;
import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.hillel.it.yuzhanka.model.entity.User;

public interface ReservationRepository {
	void save(Reservation reservation);

	void delete(Reservation reservation);

	// boolean changeReservation (Reservation oldReservation, Reservation
	// newReservation);
	Reservation findById(int id);

	List<Reservation> findByOwner(User user);

	Reservation findByOrderClientFormat(String orderClientFormat);

	List<Reservation> findActiveByPeriod(Date start, Date end);

	List<Reservation> findAll();
}
