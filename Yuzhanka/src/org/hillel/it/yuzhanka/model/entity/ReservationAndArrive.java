package org.hillel.it.yuzhanka.model.entity;

import java.util.Date;

public class ReservationAndArrive {
	private int id;
	private Date createdAt;
	private User createdBy; // ����� ���� ��� �������� ��� � ��� ������
	private boolean isAcctive;
	private String nubberForClient; // ���-�� ����� ��� �������� ����+�����
									// 20150417003
	private User ownerOfReservation;
	private Date dateOfReservation;
	private float costOfReservation;
	private float prepaydOfReservation;
	private int methodOfPrepaid; // 0 - �������� 1 - ������
									// 2 - �������� �������...
	private boolean prepaidIsGot;
	private Date dateWhenPrepaidIsGot;
	private String commentOfClient; // ���������� ���������
	private String commentOfManager; // ���������� ���������
	private Date dateTimeOfArrive;
	private Date dateTimeOfDeparture;
	private float amountOfStay; // ����� �� ����������
	private float gotFromAmountOfStay;
	private Date dateWhenAmountIsGot;
	private int paymantMethod;// 0 - �������� 1 - ������
								// 2 - �������� �������...

}
