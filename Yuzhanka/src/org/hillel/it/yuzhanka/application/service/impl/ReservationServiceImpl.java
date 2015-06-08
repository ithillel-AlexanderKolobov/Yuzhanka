package org.hillel.it.yuzhanka.application.service.impl;

import java.util.Date;
import java.util.List;

import org.hillel.it.yuzhanka.application.service.ReservationService;
import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.hillel.it.yuzhanka.persistence.repository.ReservationRepository;
import org.hillel.it.yuzhanka.persistence.repository.impl.inmemory.InMemoryReservationRepository;

public class ReservationServiceImpl implements ReservationService
{
	ReservationRepository repository = new InMemoryReservationRepository();

	@Override
	public void saveReservation(Reservation reservation)
	{
		repository.saveReservation(reservation);
		
	}

	@Override
	public void deleteReservation(Reservation reservation)
	{
			repository.deleteReservation(reservation);
	}

	@Override
	public Reservation getById(int id) 
	{
		
		return repository.getById(id);
	}

	@Override
	public List<Reservation> findByOwnerId(int userId) 
	{
		
		return repository.findByOwnerId(userId);
	}

	@Override
	public Reservation findByOrderClientFormat(String orderClientFormat) 
	{
		return repository.findByOrderClientFormat(orderClientFormat);
	}

	@Override
	public List<Reservation> findActiveByPeriod(Date start, Date end) 
	{
		return repository.findActiveByPeriod(start, end);
	}

	@Override
	public List<Reservation> findAll() 
	{
		return repository.findAll();
	}
	

}