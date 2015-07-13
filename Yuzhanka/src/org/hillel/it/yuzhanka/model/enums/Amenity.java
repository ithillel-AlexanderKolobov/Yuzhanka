package org.hillel.it.yuzhanka.model.enums;

public enum Amenity {
	WaterCloset("Туалет"), Shower("Душ"), AirConditioner("Кондиционер"), TV("Телевизор"), Refrigerator(
			"Холодильник");
	private String name;

	private Amenity(String amenity) {
		this.name = amenity;
	}

	public String getName() {
		return name;
	}

}
