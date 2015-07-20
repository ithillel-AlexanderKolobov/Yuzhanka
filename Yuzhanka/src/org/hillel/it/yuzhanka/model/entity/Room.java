package org.hillel.it.yuzhanka.model.entity;

/**
 * Show availability of the room
 * @author Лаборант
 *
 */

public class Room extends BaseEntity {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private boolean enabled;
private int roomNumber;

private RoomType roomType;

public boolean isEnabled() {
	return enabled;
}
public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}
public int getRoomNumber() {
	return roomNumber;
}
public void setRoomNumber(int roomNumber) {
	this.roomNumber = roomNumber;
}

public RoomType getRoomType() {
	return roomType;
}
public void setRoomType(RoomType roomType) {
	this.roomType = roomType;
}



}
