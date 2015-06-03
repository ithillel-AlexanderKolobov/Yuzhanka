package org.hillel.it.yuzhanka.application.service;

import java.util.Date;
import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.hillel.it.yuzhanka.model.entity.User;

public interface ReservationService 
{
	 void saveReservation(Reservation reservation);
	 void deleteReservation(Reservation reservation);
	 Reservation getById (int id);
	 List<Reservation> findByOwnerId (int userId);
	 Reservation findByOrderClientFormat (String orderClientFormat);
	 List<Reservation> findActiveByPeriod (Date start, Date end);
	 List<Reservation> findAll ();

}
