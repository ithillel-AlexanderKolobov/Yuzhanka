
package org.hillel.it.yuzhanka.model.entity;

import java.util.ArrayList;
import java.util.Date;

public class Reservation extends BaseEntity{
	
	private boolean active;
	private ArrayList<Integer> reservedRoomsIds;
	private String orderClientFormat; // ���-�� ����� ��� �������� ����+�����
									// 20150417003
	private int ownerId;
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}	
	public Date getDepartureDateTime() {
		return departureDateTime;
	}	
	public String getOrderClientFormat() {
		return orderClientFormat;
	}
	public int getOwner() {
		return ownerId;
	}
	public void setArrivalDateTime(Date arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}	
	public void setDepartureDateTime(Date departureDateTime) {
		this.departureDateTime = departureDateTime;
	}	
	public void setOrderClientFormat(String orderClientFormat) {
		this.orderClientFormat = orderClientFormat;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	
}
