package org.hillel.it.yuzhanka.persistence.repository.impl.inmemory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.hillel.it.yuzhanka.model.entity.User;
import org.hillel.it.yuzhanka.persistence.repository.ReservationRepository;

public class ReservationRepositoryInmemoryImpl implements ReservationRepository{
	List<Reservation> reservationRepository=new ArrayList<>();

	@Override
	public boolean addReservation(Reservation reservation) {
		
		return false;
	}

	@Override
	public boolean deleteReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeReservation(Reservation newReservation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Reservation getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation getByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation getByOrderClientFormat(String orderClientFormat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> getByPeriod(Date start, Date end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
