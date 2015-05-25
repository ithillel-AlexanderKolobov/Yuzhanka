package org.hillel.it.yuzhanka.model.entity;

import java.util.Date;

public class RoomType extends BaseEntity {
	
	private String titleOfType;
	private int numberOfPlaces;
	private boolean waterCloset;
	private boolean shower;
	private boolean airConditioner;
	private boolean tv;
	private boolean refrigerator;
	private String description; // Будет хранить статью с описанием.Возможно
								// стоит вынести в отдельный тип.
	private String linkToPhoto;
	

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
