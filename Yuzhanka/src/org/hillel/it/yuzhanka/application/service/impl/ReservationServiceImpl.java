package org.hillel.it.yuzhanka.application.service.impl;

import java.util.Date;
import java.util.List;

import org.hillel.it.yuzhanka.application.service.ReservationService;
import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.hillel.it.yuzhanka.model.entity.User;
import org.hillel.it.yuzhanka.persistence.repository.ReservationRepository;
import org.hillel.it.yuzhanka.persistence.repository.impl.file.FileRepository;

public class ReservationServiceImpl implements ReservationService
{
	//ReservationRepository repository = new InMemoryReservationRepository();
	ReservationRepository repository;
	

	public ReservationServiceImpl() {
		repository = FileRepository.getInstance().getReservationRepository();
	}

	@Override
	public void save(Reservation reservation)
	{
		repository.save(reservation);
		
	}

	@Override
	public void delete(Reservation reservation)
	{
			repository.delete(reservation);
	}

	@Override
	public Reservation findById(int id) 
	{
		
		return repository.findById(id);
	}

	@Override
	public List<Reservation> findByOwner(User user) 
	{
		
		return repository.findByOwner(user);
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
