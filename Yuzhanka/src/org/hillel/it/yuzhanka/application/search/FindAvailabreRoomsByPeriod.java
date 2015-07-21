package org.hillel.it.yuzhanka.application.search;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hillel.it.yuzhanka.application.service.ReservationService;
import org.hillel.it.yuzhanka.application.service.RoomService;
import org.hillel.it.yuzhanka.application.service.impl.ReservationServiceImpl;
import org.hillel.it.yuzhanka.application.service.impl.RoomServiceImpl;
import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.hillel.it.yuzhanka.model.entity.Room;
import org.hillel.it.yuzhanka.model.entity.RoomType;

public class FindAvailabreRoomsByPeriod {

	public List<Room> findAvailableRoomsByType(RoomType roomType, Date startDate, Date endDate) {
		RoomService roomService = new RoomServiceImpl();
		List<Room> allRooms = roomService.findAll();
		ReservationService reservationService = new ReservationServiceImpl();
		List<Reservation> reservations = reservationService.findActiveByPeriod(startDate, endDate);
		Map<Integer, Room> requiredTypeRooms = new HashMap<>();
		for (Room currentRoom : allRooms) {
			if (currentRoom.getRoomType().getId() == roomType.getId() && currentRoom.isEnabled()) {
				requiredTypeRooms.put(currentRoom.getRoomNumber(), currentRoom);
			}
		}
		for (Reservation currentReservation : reservations) {
			for (Room currenRoom : currentReservation.getReservedRooms()) {
				requiredTypeRooms.remove(currenRoom.getRoomNumber());
			}

		}

		return new ArrayList<>(requiredTypeRooms.values());
	}

}
