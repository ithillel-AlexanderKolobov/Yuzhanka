
package org.hillel.it.yuzhanka.model.entity;

import java.util.ArrayList;
import java.util.Date;

public class Reservation extends BaseEntity{
	
	private boolean active;
	private ArrayList<Room> reservedRooms;
	private String orderClientFormat; // ���-�� ����� ��� �������� ����+�����
									// 20150417003
	private User Owner;
	private float Cost;
	private float Prapaid;
	/* 
	 * ����� ������� ������ ����� ����������, 
	 * ����� ������� ����� ��������� �� �����-�� ������� ���������
	 * �� ��������� ������� X
	 */
	boolean prepaided;
	private String commentClient; // ���������� ���������
	private String commentManager; // ���������� ���������
	private Date arrivalDateTime;
	/*
	 * ��� ������� ����� ����������, ��� ������ ���������
	 * ����� ������� ������ ���������� ��������� ���.
	 */
	boolean clientArrived;
	private Date departureDateTime;
	
	public Date getArrivalDateTime() {
		return arrivalDateTime;
	}
	public Date getCreatedAt() {
		return createdAt;
	}	
	public User getCreatedBy() {
		return createdBy;
	}
	public Date getDepartureDateTime() {
		return departureDateTime;
	}
	public int getId() {
		return id;
	}
	public String getOrderClientFormat() {
		return orderClientFormat;
	}
	public User getOwner() {
		return Owner;
	}
	public void setArrivalDateTime(Date arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	public void setDepartureDateTime(Date departureDateTime) {
		this.departureDateTime = departureDateTime;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setOrderClientFormat(String orderClientFormat) {
		this.orderClientFormat = orderClientFormat;
	}
	public void setOwner(User owner) {
		Owner = owner;
	}
	public void setReservationOwner(User reservationOwner) {
		this.Owner = reservationOwner;
	}
}
