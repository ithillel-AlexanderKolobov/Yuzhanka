package org.hillel.it.yuzhanka.model.entity;

import java.util.ArrayList;
import java.util.Date;

public class Reservation extends BaseEntity{
	
	private boolean active;
	private ArrayList<Room>[] reservedRooms;
	private String orderClientFormat; // что-бы номер был красивый дата+номер
									// 20150417003
	private User reservationOwner;
	private float reservationCost;
	private float reservationPrapaid;
	/* 
	 * нужно наверно ввести такую переменную, 
	 * чтобы система могла проверить не нужно-ли снимать предзаказ
	 * по истечении времени X
	 */
	//boolean prepaided;
	private String commentClient; // коментарий заказчика
	private String commentManager; // коментарий менеджера
	private Date arrivalDateTime;
	/*
	 * еще наверно нужна переменная, что клиент заселился
	 * иначе система должна напоминать позвонить ему.
	 */
	// boolean clientArrived;
	private Date departureDateTime;		
}
