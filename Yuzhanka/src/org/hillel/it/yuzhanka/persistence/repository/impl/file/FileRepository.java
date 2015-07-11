package org.hillel.it.yuzhanka.persistence.repository.impl.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import org.hillel.it.yuzhanka.model.entity.Payment;
import org.hillel.it.yuzhanka.model.entity.Reservation;
import org.hillel.it.yuzhanka.model.entity.Room;
import org.hillel.it.yuzhanka.model.entity.RoomType;
import org.hillel.it.yuzhanka.model.entity.User;

public class FileRepository {
	private static FileRepository instance;
	private FilePaymentRepository paymentRepository;
	private FileReservationRepository reservationRepository;
	private FileRoomRepository roomRepository;
	private FileRoomTypeRepository roomTypeRepository;
	private FileUserRepository userRepository;

	protected FileRepository() {
		paymentRepository = new FilePaymentRepository();
		reservationRepository = new FileReservationRepository();
		roomRepository = new FileRoomRepository();
		roomTypeRepository = new FileRoomTypeRepository();
		userRepository = new FileUserRepository();
		deserialize();
	}

	public static FileRepository getInstance() {
		if (instance == null) {
			instance = new FileRepository();
		}
		return instance;
	}

	public void serialize() {

		try (FileOutputStream fos = new FileOutputStream("resources/filerepository.bin");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(paymentRepository.getStorage());
			oos.writeObject(reservationRepository.getStorage());
			oos.writeObject(roomRepository.getStorage());
			oos.writeObject(roomTypeRepository.getStorage());
			oos.writeObject(userRepository.getStorage());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void deserialize() {
		try (FileInputStream fis = new FileInputStream("resources/filerepository.bin");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			paymentRepository.setStorage((HashMap<Integer, Payment>) ois.readObject());
			reservationRepository.setStorage((HashMap<Integer, Reservation>) ois.readObject());
			roomRepository.setStorage((HashMap<Integer, Room>) ois.readObject());
			roomTypeRepository.setStorage((HashMap<Integer, RoomType>) ois.readObject());
			userRepository.setStorage((HashMap<Integer, User>) ois.readObject());
		} catch (FileNotFoundException e) {
			paymentRepository.setStorage(new HashMap<Integer, Payment>());
			reservationRepository.setStorage(new HashMap<Integer, Reservation>());
			roomRepository.setStorage(new HashMap<Integer, Room>());
			roomTypeRepository.setStorage(new HashMap<Integer, RoomType>());
			userRepository.setStorage(new HashMap<Integer, User>());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public FilePaymentRepository getPaymentRepository() {
		return paymentRepository;
	}

	public FileReservationRepository getReservationRepository() {
		return reservationRepository;
	}

	public FileRoomRepository getRoomRepository() {
		return roomRepository;
	}

	public FileRoomTypeRepository getRoomTypeRepository() {
		return roomTypeRepository;
	}

	public FileUserRepository getUserRepository() {
		return userRepository;
	}
	

}
