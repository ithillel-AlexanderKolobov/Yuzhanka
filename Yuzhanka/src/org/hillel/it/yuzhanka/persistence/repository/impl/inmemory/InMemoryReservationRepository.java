package org.hillel.it.yuzhanka.persistence.repository.impl.inmemory;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.hillel.it.yuzhanka.persistence.repository.ReservationRepository;

public class InMemoryReservationRepository implements ReservationRepository {
	Map<Integer, Reservation> reservationRepository = new HashMap<>();
	int nextId = 1;

	public void saveReservation(Reservation reservation) {
		if (reservation.getId() == 0) {
			reservation.setId(nextId);
			nextId++;
			reservationRepository.put(nextId, reservation);
		} else {
			reservationRepository.replace(reservation.getId(), reservation);
		}

	}

	public void deleteReservation(Reservation reservation) {
		reservationRepository.remove(reservation.getId());
	}

	public Reservation getById(int id) {
		return reservationRepository.get(id);
	}

	public List<Reservation> findByOwnerId(int userId) {
		List<Reservation> reservationsList = new ArrayList<>();
		for (Reservation reservation : reservationRepository.values()) {
			if (reservation.getOwner() == userId) {
				reservationsList.add(reservation);
			}
		}
		return reservationsList;
	}

	public Reservation findByOrderClientFormat(String orderClientFormat) {
		for (Reservation reservation : reservationRepository.values()) {
			if (reservation.getOrderClientFormat().equals(orderClientFormat)) {
				return reservation;
			}
		}
		return null;
	}

	public List<Reservation> findActiveByPeriod(Date start, Date end) {
		List<Reservation> reservationsList = new ArrayList<>();
		for (Reservation reservation : reservationRepository.values()) {
			Date arrivalDate = reservation.getArrivalDateTime();
			Date departureDate = reservation.getDepartureDateTime();
			if (reservation.isActive()
					&& ((arrivalDate.after(start) && arrivalDate.before(end))
							|| (departureDate.after(start) && departureDate
									.before(end)) || (arrivalDate.before(start) && departureDate
							.after(end)))) {
				reservationsList.add(reservation);
			}
		}
		return reservationsList;
	}

	public List<Reservation> findAll() {
		return new ArrayList<>(reservationRepository.values());
	}

}
