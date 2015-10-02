package org.hillel.it.yuzhanka.model.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Show availability of the room
 * 
 * @author Лаборант
 *
 */
@Entity
public class Room extends BaseEntity {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private boolean enabled;
	private int roomNumber;
	@ManyToOne
	private RoomType roomType;

	public Room() {
		super();
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

}
