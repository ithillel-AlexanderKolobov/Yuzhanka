package org.hillel.it.yuzhanka.starter;

import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.hillel.it.yuzhanka.persistence.repository.impl.inmemory.InMemoryReservationRepository;

public class Starter {

	public static void main(String[] args) {
		Reservation reservation1 = new Reservation();
		reservation1.setId(100);
		Reservation reservation2 = new Reservation();
		reservation2.setId(200);
		Reservation reservation3 = new Reservation();
		reservation1.setId(300);
		InMemoryReservationRepository inmemoryReservationRepository = new InMemoryReservationRepository();
		inmemoryReservationRepository.saveReservation(reservation1);
		inmemoryReservationRepository.saveReservation(reservation2);		

	}

}
