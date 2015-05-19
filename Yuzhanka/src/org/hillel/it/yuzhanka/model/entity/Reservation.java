package org.hillel.it.yuzhanka.model.entity;

import java.util.ArrayList;
import java.util.Date;

public class Reservation extends BaseEntity{
	
	private boolean active;
	private ArrayList<Room>[] reservedRooms;
	private String orderClientFormat; // ���-�� ����� ��� �������� ����+�����
									// 20150417003
	private User reservationOwner;
	private float reservationCost;
	private float reservationPrapaid;
	private int prepaymentMethod; // 0 - �������� 1 - ������
									// 2 - �������� �������...
	/* ������� � ��������� �����
	private boolean prepaid;
	private Date prepaymentDate;*/
	
	private String commentClient; // ���������� ���������
	private String commentManager; // ���������� ���������
	private Date arrivalDateTime;
	private Date departureDateTime;
	private float totalCost; // ����� �� ����������
	
	/* ���� ������� � ����� �����
	private float gotFromAmountOfStay;
	private Date dateWhenAmountIsGot;
	private int paymantMethod;// 0 - �������� 1 - ������
								// 2 - �������� �������...*/
	
}
