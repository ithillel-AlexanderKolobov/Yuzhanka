package org.hillel.it.yuzhanka.starter;

import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.hillel.it.yuzhanka.persistence.repository.impl.inmemory.InMemoryReservationRepository;

public class Starter {

	public static void main(String[] args) {
		Reservation reservation1 = new Reservation();		
		Reservation reservation2 = new Reservation();		
		Reservation reservation3 = new Reservation();		
		InMemoryReservationRepository inmemoryReservationRepository = new InMemoryReservationRepository();
		inmemoryReservationRepository.saveReservation(reservation1);
		inmemoryReservationRepository.saveReservation(reservation2);
		inmemoryReservationRepository.saveReservation(reservation3);
		System.out.println(reservation1.getId());
		System.out.println(reservation2.getId());
		System.out.println(reservation3.getId());
		inmemoryReservationRepository.deleteReservation(reservation2);
		inmemoryReservationRepository.deleteReservation(reservation2);
		Reservation reservation4 = new Reservation();
		inmemoryReservationRepository.saveReservation(reservation4);
		System.out.println(reservation4.getId());
		Reservation newre=inmemoryReservationRepository.getById(3);
		System.out.println(newre.getId());

	}

}
