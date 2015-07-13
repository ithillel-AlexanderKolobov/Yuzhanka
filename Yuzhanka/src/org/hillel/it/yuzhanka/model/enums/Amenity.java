package org.hillel.it.yuzhanka.model.enums;

public enum Amenity {
	WaterCloset("������"), Shower("���"), AirConditioner("�����������"), TV("���������"), Refrigerator(
			"�����������");
	private String name;

	private Amenity(String amenity) {
		this.name = amenity;
	}

	public String getName() {
		return name;
	}

}
