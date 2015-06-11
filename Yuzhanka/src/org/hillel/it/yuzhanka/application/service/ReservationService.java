package org.hillel.it.yuzhanka.application.service;

import java.util.Date;
import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Reservation;


public interface ReservationService 
{
	 void save(Reservation reservation);
	 void delete(Reservation reservation);
	 Reservation findById (int id);
	 List<Reservation> findByOwnerId (int userId);
	 Reservation findByOrderClientFormat (String orderClientFormat);
	 List<Reservation> findActiveByPeriod (Date start, Date end);
	 List<Reservation> findAll ();

}
