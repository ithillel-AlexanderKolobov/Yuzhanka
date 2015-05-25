package org.hillel.it.yuzhanka.model.entity;

import java.util.Date;

public class Room extends BaseEntity {

private boolean enabled;
private int numberOfRoom;
private int numberOfPlaces;
private RoomType typeOfRoom;
private int roomNumber;
private int placesQuantiti;
private RoomType roomType;
private String linkToPhoto1;
private String linkToPhoto2;
private String linkToPhoto3;
private String linkToPhoto4; // ссылки на фотографии лежащие на сервере
private String linkToPhoto5; // Сергей ребятам тоже так посоветовал
private String linkToPhoto6;
private String linkToPhoto7;
private String linkToPhoto8;


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
