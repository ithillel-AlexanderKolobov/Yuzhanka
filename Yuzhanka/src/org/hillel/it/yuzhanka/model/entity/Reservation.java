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
	private int prepaymentMethod; // 0 - наличные 1 - картой
									// 2 - денежный перевод...
	/* вынести в отдельный класс
	private boolean prepaid;
	private Date prepaymentDate;*/
	
	private String commentClient; // коментарий заказчика
	private String commentManager; // коментарий менеджера
	private Date arrivalDateTime;
	private Date departureDateTime;
	private float totalCost; // сумма за проживание
	
	/* тоже вынести в класс оплат
	private float gotFromAmountOfStay;
	private Date dateWhenAmountIsGot;
	private int paymantMethod;// 0 - наличные 1 - картой
								// 2 - денежный перевод...*/
	
}
