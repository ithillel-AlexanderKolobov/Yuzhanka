
package org.hillel.it.yuzhanka.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Person can reserve any room for any period
 * 
 * @author Лаборант
 *
 */
@Entity
public class Reservation extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean active;
	@ManyToMany
	private List<Room> reservedRooms;
	private String orderClientFormat; // что-бы номер был красивый дата+номер
	// 20150417003
	@ManyToOne
	private User owner;
	private float Cost;
	private float Prepaid;
	/*
	 * нужно наверно ввести такую переменную, чтобы система могла проверить не
	 * нужно-ли снимать предзаказ по истечении времени X
	 */
	boolean prepaided;
	private String commentClient; // коментарий заказчика
	private String commentManager; // коментарий менеджера
	private Date arrivalDateTime;
	/*
	 * еще наверно нужна переменная, что клиент заселился иначе система должна
	 * напоминать позвонить ему.
	 */
	private boolean clientArrived;
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

	public User getOwner() {
		return owner;
	}

	public List<Room> getReservedRooms() {
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

	public void setOwnerId(User owner) {
		this.owner = owner;
	}

	public void setReservedRooms(ArrayList<Room> reservedRooms) {
		this.reservedRooms = reservedRooms;
	}

}
