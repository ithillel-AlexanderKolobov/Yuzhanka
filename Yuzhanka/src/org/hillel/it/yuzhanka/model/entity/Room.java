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

private String linkToPhoto1;
private String linkToPhoto2;
private String linkToPhoto3;
private String linkToPhoto4; 
private String linkToPhoto5; 
private String linkToPhoto6;
private String linkToPhoto7;
private String linkToPhoto8;
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
