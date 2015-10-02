package org.hillel.it.yuzhanka.model.entity;

import javax.persistence.Entity;

@Entity
public class Amenity extends BaseEntity {

	private String name;

	private String linkPhoto;

	public Amenity() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLinkPhoto() {
		return linkPhoto;
	}

	public void setLinkPhoto(String linkPhoto) {
		this.linkPhoto = linkPhoto;
	}

	@Override
	public String toString() {
		return "Amenity" + id;
	}

}
