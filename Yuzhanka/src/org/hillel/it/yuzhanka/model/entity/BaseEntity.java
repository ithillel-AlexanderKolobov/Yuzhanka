package org.hillel.it.yuzhanka.model.entity;

import java.util.Date;

public class BaseEntity {
	protected int id;
	protected Date createdAt;
	protected User createdBy; // может быть как менеджер так и сам клиент
	
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
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	
}
