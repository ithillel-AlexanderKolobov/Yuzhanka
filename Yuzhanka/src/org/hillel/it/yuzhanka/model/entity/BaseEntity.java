package org.hillel.it.yuzhanka.model.entity;

import java.util.Date;

/**
 * Base class for all business entities
 * 
 * @author Лаборант
 *
 */
public abstract class BaseEntity {
	/**
	 * Unique entity identifier
	 */
	protected int id;

	/**
	 * Timestamp of entity creation
	 */
	protected Date createdAt;

	/**
	 * Person who created specific entity
	 */
	protected User createdBy;

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
