package org.hillel.it.yuzhanka.persistence.repository.impl.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileRepository {
	private static FileRepository instance;
	private FilePaymentRepository paymentRepository;
	private FileReservationRepository reservationRepository;
	private FileRoomRepository roomRepository;
	private FileRoomTypeRepository roomTypeRepository;
	private FileUserRepository userRepository;

	protected FileRepository() {
		deserialize();
	}

	protected FileRepository(int number) {

	}

	public static FileRepository getInstance() {
		if (instance == null) {
			instance = new FileRepository();
		}
		return instance;
	}

	public void serialize() {

		try (FileOutputStream fos = new FileOutputStream("filerepository.bin");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(paymentRepository);
			oos.writeObject(reservationRepository);
			oos.writeObject(roomRepository);
			oos.writeObject(roomTypeRepository);
			oos.writeObject(userRepository);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void deserialize() {
		try (FileInputStream fis = new FileInputStream("filerepository.bin");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			System.out.println("тута есть файлик");
			paymentRepository = (FilePaymentRepository) ois.readObject();
			reservationRepository = (FileReservationRepository) ois.readObject();
			roomRepository = (FileRoomRepository) ois.readObject();
			roomTypeRepository = (FileRoomTypeRepository) ois.readObject();
			userRepository = (FileUserRepository) ois.readObject();
		} catch (FileNotFoundException e) {			
			paymentRepository = new FilePaymentRepository();
			reservationRepository = new FileReservationRepository();
			roomRepository = new FileRoomRepository();
			roomTypeRepository = new FileRoomTypeRepository();
			userRepository = new FileUserRepository();

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
