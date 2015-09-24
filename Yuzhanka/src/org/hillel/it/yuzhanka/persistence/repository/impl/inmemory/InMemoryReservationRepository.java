package org.hillel.it.yuzhanka.persistence.repository.impl.inmemory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.hillel.it.yuzhanka.model.entity.User;
import org.hillel.it.yuzhanka.persistence.repository.ReservationRepository;

public class InMemoryReservationRepository extends InMemoryBaseRepository<Reservation>
		implements ReservationRepository {
	
	public List<Reservation> findByOwner(User user) {
		List<Reservation> reservationsList = new ArrayList<>();
		for (Reservation reservation : storage.values()) {
			if (reservation.getOwner().equals(user)) {
				reservationsList.add(reservation);
			}
		}
		return reservationsList;
	}

	public Reservation findByOrderClientFormat(String orderClientFormat) {
		for (Reservation reservation : storage.values()) {
			if (reservation.getOrderClientFormat().equals(orderClientFormat)) {
				return reservation;
			}
		}
		return null;
	}

	public List<Reservation> findActiveByPeriod(Date start, Date end) {
		List<Reservation> reservationsList = new ArrayList<>();
		for (Reservation reservation : storage.values()) {
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
	
}
