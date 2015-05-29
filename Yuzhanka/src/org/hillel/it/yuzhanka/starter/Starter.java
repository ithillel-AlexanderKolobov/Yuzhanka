package org.hillel.it.yuzhanka.starter;

import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.hillel.it.yuzhanka.persistence.repository.impl.inmemory.ReservationRepositoryInmemoryImpl;

public class Starter {

	public static void main(String[] args) {
		Reservation reservation1 = new Reservation();
		reservation1.setId(100);
		Reservation reservation2 = new Reservation();
		reservation2.setId(200);
		Reservation reservation3 = new Reservation();
		reservation1.setId(300);
		ReservationRepositoryInmemoryImpl reservationRepositoryInmemoryImpl = new ReservationRepositoryInmemoryImpl();
		reservationRepositoryInmemoryImpl.addReservation(reservation1);
		reservationRepositoryInmemoryImpl.addReservation(reservation2);
		System.out.println(reservationRepositoryInmemoryImpl.deleteReservation(reservation1));
		System.out.println(reservationRepositoryInmemoryImpl.deleteReservation(reservation1));

	}

}
