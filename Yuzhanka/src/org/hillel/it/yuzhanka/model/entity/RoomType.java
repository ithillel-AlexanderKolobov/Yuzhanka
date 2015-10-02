package org.hillel.it.yuzhanka.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Create different room types depends on opportunities
 * 
 * @author Лаборант
 *
 */
@Entity
public class RoomType extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String titleOfType;
	private int numberOfPlaces;

	@ManyToMany
	private List<Amenity> amenities;

	private String description;

	private String linkToPhoto1;
	private String linkToPhoto2;
	private String linkToPhoto3;
	private String linkToPhoto4;
	private String linkToPhoto5;

	public RoomType() {
		super();

	}

	public List<Amenity> getAmenities() {
		return amenities;
	}

	public String getDescription() {
		return description;
	}

	public String getLinkToPhoto1() {
		return linkToPhoto1;
	}

	public String getLinkToPhoto2() {
		return linkToPhoto2;
	}

	public String getLinkToPhoto3() {
		return linkToPhoto3;
	}

	public String getLinkToPhoto4() {
		return linkToPhoto4;
	}

	public String getLinkToPhoto5() {
		return linkToPhoto5;
	}

	public int getNumberOfPlaces() {
		return numberOfPlaces;
	}

	public String getTitleOfType() {
		return titleOfType;
	}

	public void setAmenities(List<Amenity> amenities) {
		this.amenities = amenities;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLinkToPhoto1(String linkToPhoto1) {
		this.linkToPhoto1 = linkToPhoto1;
	}

	public void setLinkToPhoto2(String linkToPhoto2) {
		this.linkToPhoto2 = linkToPhoto2;
	}

	public void setLinkToPhoto3(String linkToPhoto3) {
		this.linkToPhoto3 = linkToPhoto3;
	}

	public void setLinkToPhoto4(String linkToPhoto4) {
		this.linkToPhoto4 = linkToPhoto4;
	}

	public void setLinkToPhoto5(String linkToPhoto5) {
		this.linkToPhoto5 = linkToPhoto5;
	}

	public void setNumberOfPlaces(int numberOfPlaces) {
		this.numberOfPlaces = numberOfPlaces;
	}

	public void setTitleOfType(String titleOfType) {
		this.titleOfType = titleOfType;
	}

}
