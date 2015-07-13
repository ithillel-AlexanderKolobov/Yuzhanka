package org.hillel.it.yuzhanka.model.entity;

import java.util.List;

import org.hillel.it.yuzhanka.model.enums.Amenity;

/**
 * Create different room types depends on opportunities
 * 
 * @author Лаборант
 *
 */

public class RoomType extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String titleOfType;
	private int numberOfPlaces;
	// private boolean waterCloset;
	// private boolean shower;
	// private boolean airConditioner;
	// private boolean tv;
	// private boolean refrigerator;
	private List<Amenity> amenities;
	private String description; // Будет хранить статью с описанием.Возможно
	// стоит вынести в отдельный тип.
	private String linkToPhoto;

	public List<Amenity> getAmenities() {
		return amenities;
	}

	// public boolean isWaterCloset() {
	// return waterCloset;
	// }
	// public void setWaterCloset(boolean waterCloset) {
	// this.waterCloset = waterCloset;
	// }
	// public boolean isShower() {
	// return shower;
	// }
	// public void setShower(boolean shower) {
	// this.shower = shower;
	// }
	// public boolean isAirConditioner() {
	// return airConditioner;
	// }
	// public void setAirConditioner(boolean airConditioner) {
	// this.airConditioner = airConditioner;
	// }
	// public boolean isTv() {
	// return tv;
	// }
	// public void setTv(boolean tv) {
	// this.tv = tv;
	// }
	// public boolean isRefrigerator() {
	// return refrigerator;
	// }
	// public void setRefrigerator(boolean refrigerator) {
	// this.refrigerator = refrigerator;
	// }
	public String getDescription() {
		return description;
	}

	public String getLinkToPhoto() {
		return linkToPhoto;
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

	public void setLinkToPhoto(String linkToPhoto) {
		this.linkToPhoto = linkToPhoto;
	}

	public void setNumberOfPlaces(int numberOfPlaces) {
		this.numberOfPlaces = numberOfPlaces;
	}

	public void setTitleOfType(String titleOfType) {
		this.titleOfType = titleOfType;
	}

}
