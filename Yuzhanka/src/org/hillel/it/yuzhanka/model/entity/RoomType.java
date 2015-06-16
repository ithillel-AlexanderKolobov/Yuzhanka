package org.hillel.it.yuzhanka.model.entity;

/**
 * Create different room types depends on opportunities
 * @author Лаборант
 *
 */

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
	public String getTitleOfType() {
		return titleOfType;
	}
	public void setTitleOfType(String titleOfType) {
		this.titleOfType = titleOfType;
	}
	public int getNumberOfPlaces() {
		return numberOfPlaces;
	}
	public void setNumberOfPlaces(int numberOfPlaces) {
		this.numberOfPlaces = numberOfPlaces;
	}
	public boolean isWaterCloset() {
		return waterCloset;
	}
	public void setWaterCloset(boolean waterCloset) {
		this.waterCloset = waterCloset;
	}
	public boolean isShower() {
		return shower;
	}
	public void setShower(boolean shower) {
		this.shower = shower;
	}
	public boolean isAirConditioner() {
		return airConditioner;
	}
	public void setAirConditioner(boolean airConditioner) {
		this.airConditioner = airConditioner;
	}
	public boolean isTv() {
		return tv;
	}
	public void setTv(boolean tv) {
		this.tv = tv;
	}
	public boolean isRefrigerator() {
		return refrigerator;
	}
	public void setRefrigerator(boolean refrigerator) {
		this.refrigerator = refrigerator;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLinkToPhoto() {
		return linkToPhoto;
	}
	public void setLinkToPhoto(String linkToPhoto) {
		this.linkToPhoto = linkToPhoto;
	}

}
