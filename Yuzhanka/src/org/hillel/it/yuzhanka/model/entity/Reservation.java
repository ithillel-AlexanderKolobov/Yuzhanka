
package org.hillel.it.yuzhanka.model.entity;

import java.util.ArrayList;
import java.util.Date;

public class Reservation extends BaseEntity{
	
	private boolean active;
	private ArrayList<Room> reservedRooms;
	private String orderClientFormat; // ���-�� ����� ��� �������� ����+�����
									// 20150417003
	private User reservationOwner;
	private float reservationCost;
	private float reservationPrapaid;
	/* 
	 * ����� ������� ������ ����� ����������, 
	 * ����� ������� ����� ��������� �� �����-�� ������� ���������
	 * �� ��������� ������� X
	 */
	//boolean prepaided;
	private String commentClient; // ���������� ���������
	private String commentManager; // ���������� ���������
	private Date arrivalDateTime;
	/*
	 * ��� ������� ����� ����������, ��� ������ ���������
	 * ����� ������� ������ ���������� ��������� ���.
	 */
	// boolean clientArrived;
	private Date departureDateTime;		
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
}
