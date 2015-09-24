package org.hillel.it.yuzhanka.application.service;

import java.util.Date;
import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.hillel.it.yuzhanka.model.entity.User;


public interface ReservationService 
{
	 void save(Reservation reservation);
	 void delete(Reservation reservation);
	 Reservation findById (int id);
	 List<Reservation> findByOwner (User user);
	 Reservation findByOrderClientFormat (String orderClientFormat);
	 List<Reservation> findActiveByPeriod (Date start, Date end);
	 List<Reservation> findAll ();

}
