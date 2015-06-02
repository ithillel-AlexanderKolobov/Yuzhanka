
package org.hillel.it.yuzhanka.model.entity;

import java.util.ArrayList;
import java.util.Date;

public class Reservation extends BaseEntity{
	
	private boolean active;
	private ArrayList<Room> reservedRooms;
	private String orderClientFormat; // что-бы номер был красивый дата+номер
									// 20150417003
	private int ownerId;
	private float Cost;
	private float Prapaid;
	/* 
	 * нужно наверно ввести такую переменную, 
	 * чтобы система могла проверить не нужно-ли снимать предзаказ
	 * по истечении времени X
	 */
	boolean prepaided;
	private String commentClient; // коментарий заказчика
	private String commentManager; // коментарий менеджера
	private Date arrivalDateTime;
	/*
	 * еще наверно нужна переменная, что клиент заселился
	 * иначе система должна напоминать позвонить ему.
	 */
	boolean clientArrived;
	private Date departureDateTime;
	
	public Date getArrivalDateTime() {
		return arrivalDateTime;
	}
	public Date getCreatedAt() {
		return createdAt;
	}	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
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
	public int getOwner() {
		return ownerId;
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
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	
}
