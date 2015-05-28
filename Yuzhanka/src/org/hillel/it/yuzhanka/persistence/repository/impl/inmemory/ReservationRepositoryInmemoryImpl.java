package org.hillel.it.yuzhanka.persistence.repository.impl.inmemory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.hillel.it.yuzhanka.model.entity.User;
import org.hillel.it.yuzhanka.persistence.repository.ReservationRepository;

public class ReservationRepositoryInmemoryImpl implements ReservationRepository {
	List<Reservation> reservationRepository = new ArrayList<>();

	public boolean addReservation(Reservation reservation) {
		if (reservationRepository.add(reservation)) {
			return true;
		}
		return false;
	}

	public boolean deleteReservation(Reservation reservation) {
		if (reservationRepository.remove(reservation)) {
			return true;
		}
		return false;
	}

	public boolean changeReservation(Reservation oldReservation,
			Reservation newReservation) {
		if (reservationRepository.remove(oldReservation)) {
			if (reservationRepository.add(newReservation)) {
				return true;
			}
		}
		return false;
	}

	public Reservation getById(int id) {
		for (Reservation reservation : reservationRepository) {
			if (reservation.getId() == id) {
				return reservation;
			}
		}
		return null;
	}

	public List<Reservation> getByOwner(User user) {
		List<Reservation> reservationsList = new ArrayList<>();
		for (Reservation reservation : reservationRepository) {
			if (reservation.getOwner() == user) {
				reservationsList.add(reservation);
			}
		}
		return reservationsList;
	}

	public Reservation getByOrderClientFormat(String orderClientFormat) {
		for (Reservation reservation : reservationRepository) {
			if (reservation.getOrderClientFormat().equals(orderClientFormat)) {
				return reservation;
			}
		}
		return null;
	}

	
	public List<Reservation> getByPeriod(Date start, Date end) {
		List<Reservation> reservationsList = new ArrayList<>();
		for (Reservation reservation : reservationRepository) {
			Date arrivalDate = reservation.getArrivalDateTime();
			Date departureDate = reservation.getDepartureDateTime();
			if ((arrivalDate.after(start) && arrivalDate.before(end))
					|| (departureDate.after(start) && departureDate.before(end))
					|| (arrivalDate.before(start) && departureDate.after(end))) {
				reservationsList.add(reservation);
			}
		}
		return reservationsList;
	}

	
	public List<Reservation> getAll() {		
		return reservationRepository;
	}

}
