package org.hillel.it.yuzhanka.starter;

import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.hillel.it.yuzhanka.persistence.repository.impl.inmemory.InMemoryReservationRepository;

public class Starter {

	public static void main(String[] args) {
		Reservation reservation1 = new Reservation();		
		Reservation reservation2 = new Reservation();		
		Reservation reservation3 = new Reservation();		
		InMemoryReservationRepository inmemoryReservationRepository = new InMemoryReservationRepository();
		inmemoryReservationRepository.save(reservation1);
		inmemoryReservationRepository.save(reservation2);
		inmemoryReservationRepository.save(reservation3);
		System.out.println(reservation1.getId());
		System.out.println(reservation2.getId());
		System.out.println(reservation3.getId());
		inmemoryReservationRepository.delete(reservation2);
		inmemoryReservationRepository.delete(reservation2);
		Reservation reservation4 = new Reservation();
		inmemoryReservationRepository.save(reservation4);
		System.out.println(reservation4.getId());
		Reservation newre=inmemoryReservationRepository.findById(3);
		System.out.println(newre.getId());		

	}

}
