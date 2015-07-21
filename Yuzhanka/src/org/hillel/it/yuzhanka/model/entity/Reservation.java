
package org.hillel.it.yuzhanka.model.entity;

import java.util.ArrayList;
import java.util.Date;
/**
 * Person can reserve any room for any period
 * @author ��������
 *
 */
public class Reservation extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean active;
	private ArrayList<Room> reservedRooms;
	private String orderClientFormat; // ���-�� ����� ��� �������� ����+�����
	// 20150417003
	private int ownerId;
	private float Cost;
									private float Prepaid;
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
	public Date getDepartureDateTime() {
		return departureDateTime;
	}
	
	public String getOrderClientFormat() {
		return orderClientFormat;
	}		
	public int getOwner() {
		return ownerId;
	}
	public ArrayList<Room> getReservedRooms() {
		return reservedRooms;
	}	
	public boolean isActive() {
		return active;
	}	
	public void setActive(boolean active) {
		this.active = active;
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
	public void setReservedRooms(ArrayList<Room> reservedRooms) {
		this.reservedRooms = reservedRooms;
	}
	
}
