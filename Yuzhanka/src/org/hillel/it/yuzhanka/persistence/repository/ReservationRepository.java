package org.hillel.it.yuzhanka.persistence.repository;

import java.util.Date;
import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Reservation;

public interface ReservationRepository {
	boolean addReservation(Reservation reservation);
	boolean deleteReservation (Reservation reservation);
	boolean changeReservation (Reservation newReservation);
	Reservation getById (int id);
	Reservation getByOrderClientFormat (String orderClientFormat);
	List<Reservation> getByPeriod (Date start, Date end);
	List<Reservation> getAll ();
}